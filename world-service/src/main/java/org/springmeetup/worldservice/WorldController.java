package org.springmeetup.worldservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WorldController {

	@Value("${world.message}")
	private String message;

	@RequestMapping("/world")
	public OperationResponse hello() {
		return OperationResponse.builder()
				.returnCode(0)
				.returnMessage(message)
				.build()
				;
	}
}
