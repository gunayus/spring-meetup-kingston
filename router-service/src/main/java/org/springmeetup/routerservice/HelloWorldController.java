package org.springmeetup.routerservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequiredArgsConstructor
public class HelloWorldController {

	private final HelloServiceClient helloServiceClient;

	private final WorldServiceClient worldServiceClient;

	@RequestMapping("/hello/world")
	public OperationResponse hello() {
		String message = helloServiceClient.hello().getReturnMessage()
				+ " "
				+ worldServiceClient.world().getReturnMessage();

		return OperationResponse.builder()
				.returnCode(0)
				.returnMessage(message)
				.build()
				;
	}
}
