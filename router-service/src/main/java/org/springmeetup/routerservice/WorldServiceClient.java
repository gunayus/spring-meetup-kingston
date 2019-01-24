package org.springmeetup.routerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(serviceId = "world-service")
public interface WorldServiceClient {

	@RequestMapping("/world")
	public OperationResponse world();

}
