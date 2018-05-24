/**
 * 
 */
package uvsoftgroup.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springmysqlrestfulws.model.PlotInfoOwnershipInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="plotInfoOwnershipInfo",path="plotInfoOwnershipInfos")
public interface PlotInfoOwnershipInfoRepository extends PagingAndSortingRepository<PlotInfoOwnershipInfo, Long> {

}
