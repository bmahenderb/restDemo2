package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TestRes {
	private String statusCode;
    private Long msgId;
    private String messageText;
    private String correlationId;
}



