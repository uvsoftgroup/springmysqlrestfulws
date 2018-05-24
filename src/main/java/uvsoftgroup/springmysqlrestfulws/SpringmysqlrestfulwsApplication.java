package uvsoftgroup.springmysqlrestfulws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages ={"uv.springmysqlrestfulws.model"})
@EnableJpaRepositories(basePackages = {"uv.springmysqlrestfulws.repositories"})
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringmysqlrestfulwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmysqlrestfulwsApplication.class, args);
	}
}
