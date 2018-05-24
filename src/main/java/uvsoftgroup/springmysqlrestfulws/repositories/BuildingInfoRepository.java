/**
 * 
 */
package uvsoftgroup.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springmysqlrestfulws.model.BuildingInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="buildingInfo",path="buildingInfos")
public interface BuildingInfoRepository extends PagingAndSortingRepository<BuildingInfo, Long> {

}
