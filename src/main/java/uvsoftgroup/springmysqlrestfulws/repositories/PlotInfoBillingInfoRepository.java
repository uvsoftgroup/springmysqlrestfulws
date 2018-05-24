/**
 * 
 */
package uvsoftgroup.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springmysqlrestfulws.model.PlotInfoBillingInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="plotInfoBillingInfo",path="plotInfoBillingInfo")
public interface PlotInfoBillingInfoRepository extends PagingAndSortingRepository<PlotInfoBillingInfo, Long> {

}
