package org.springframework.helloservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Slf4j
public class HelloController {

	@Value("${hello.message}")
	private String message;

	@RequestMapping("/hello")
	public OperationResponse hello() {
		log.info("Hello service is invoked...");
		return OperationResponse.builder()
				.returnCode(0)
				.returnMessage(message)
				.build()
				;
	}
}
