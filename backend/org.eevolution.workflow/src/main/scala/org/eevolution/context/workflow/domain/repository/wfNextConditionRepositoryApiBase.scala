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
 */

package org.eevolution.context.workflow.domain.repository

import org.eevolution.context.workflow.domain.model.WfNextCondition
import org.eevolution.context.kernel.domain.ubiquitouslanguage._
import zio.blocking.Blocking
import zio.RIO

/*
* WfNextCondition Repository Api Base Trait for WfNextCondition Repository
*
* Is a contract to define the repository api base WfNextCondition Repository
* This class should not be modified since it is generated from the Application Dictionary 
* maybe any change made manually will be lost.
*/
trait wfNextConditionRepositoryApiBase[-R] {

    def getByWfNextConditionId(wfNextConditionId: Id): RIO[R, Option[WfNextCondition]]

    def getByWfNodeNextId(wfNodeNextId: TableDirect): RIO[R, List[WfNextCondition]]

    def getByValue(value: String): RIO[R, Option[WfNextCondition]]

    def getAll: RIO[R,List[WfNextCondition]]
    
    def getAllByClientId(tenantId: TableDirect): RIO[R, List[WfNextCondition]]
    
    def save(wfNextCondition: WfNextCondition): RIO[R, WfNextCondition]
    
}