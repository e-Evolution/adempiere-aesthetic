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

package org.eevolution.context.kernel.domain.service

import org.eevolution.context.kernel.domain.tenantRepositoryApi.TenantRepository
import org.eevolution.context.kernel.domain.tenantServiceApi.TenantService
import org.eevolution.context.kernel.domain.ubiquitouslanguage.{Id, Tenant}
import zio.RIO

trait tenantServiceBase {
  abstract class Service(
      tenantRepository: TenantRepository.Service
  ) extends TenantService.Service {

    override def getById(id: Id): RIO[TenantRepository, Option[Tenant]] =
      tenantRepository.getById(id)

  }
}
