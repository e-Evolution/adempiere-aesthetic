/**
  * Copyright (C) 2003-2021, e-Evolution Consultants S.A. , http://www.e-evolution.com
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  * Email: victor.perez@e-evolution.com, http://www.e-evolution.com , http://github.com/e-Evolution
  * Created by victor.perez@e-evolution.com , www.e-evolution.com
  **/

package org.eevolution.context.kernel.infrastructure

import org.eevolution.context.kernel.infrastructure.database.{
  DatabaseConfig,
  databaseContextApiAccessors
}
import org.eevolution.context.kernel.infrastructure.databaseConfigProviderApi.DatabaseConfigProvider
import org.eevolution.context.kernel.infrastructure.databaseContextApi.DatabaseContext.DatabaseContext
import zio.{Has, ZIO}

import javax.sql.DataSource

package object databaseProviderApi extends databaseContextApiAccessors {

  type DatabaseProvider = Has[DatabaseProvider.Service]

  object DatabaseProvider {
    trait Service {
      def dataSource: ZIO[DatabaseConfigProvider, Throwable, DataSource]
      def config: ZIO[DatabaseConfigProvider, Throwable, DatabaseConfig]
      def database: DatabaseContext
    }
  }
}
