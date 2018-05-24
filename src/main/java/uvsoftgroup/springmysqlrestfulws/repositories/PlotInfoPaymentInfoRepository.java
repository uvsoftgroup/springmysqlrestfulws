/**
 * 
 */
package uvsoftgroup.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springmysqlrestfulws.model.PlotInfoPaymentInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="plotInfoPaymentInfo",path="plotInfoPaymentInfos")
public interface PlotInfoPaymentInfoRepository extends PagingAndSortingRepository<PlotInfoPaymentInfo, Long> {

}
