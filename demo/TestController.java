package com.rest.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	 @GetMapping(value = "/test", produces = {"application/json"})
	    ResponseEntity<TestRes> insert()
	    {
		 	System.out.println("test request");
		 	TestRes s= new TestRes();
		 	s.setStatusCode("01");
		 	s.setMessageText("Message queued for processing");
		 	s.setMsgId(1000102L);
		 	s.setCorrelationId("74faca64-a2c4-4966-ba6a-d40acf59b0be");
	        return new ResponseEntity<TestRes>(s,HttpStatus.OK);
	    }

}
