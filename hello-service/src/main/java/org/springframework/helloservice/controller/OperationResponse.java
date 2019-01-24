package org.springframework.helloservice.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OperationResponse {


	private Integer returnCode;

	private String returnMessage;

}
