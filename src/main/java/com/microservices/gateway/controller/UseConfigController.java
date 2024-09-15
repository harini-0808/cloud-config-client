package com.microservices.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config-client")
public class UseConfigController {

	@Value("${message}")
	String message;
	
	@Value("${server.port.key}")
	String port;
	
	@Value("${date}")
	String date;
	
	@Value("${time}")
	String time;
	
	@GetMapping("/read-props")
	public String showProps() {
		return "Port : "+port+"\n messgae : "+message+"\n date : "+date+"\n time : "+time;
	}
}
