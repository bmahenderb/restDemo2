package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	 @PostMapping(value = "/test", produces = {"application/json"})
	    ResponseEntity<TestRes> insert(@RequestBody String ob)
	    {
		 	System.out.println(ob.toString());
		 	TestRes s= new TestRes();
		 	s.setStatusCode("01");
		 	s.setMessageText("Message queued for processing");
		 	s.setMsgId(1000102L);
		 	s.setCorrelationId("74faca64-a2c4-4966-ba6a-d40acf59b0be");
	        return new ResponseEntity<TestRes>(s,HttpStatus.OK);
	    }

}
