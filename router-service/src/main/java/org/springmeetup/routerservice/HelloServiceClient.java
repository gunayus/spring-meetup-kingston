package org.springmeetup.routerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(serviceId = "hello-service")
public interface HelloServiceClient {

	@RequestMapping("/hello")
	public OperationResponse hello();

}
