package com.renker.ws.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.renker.ws.service.IExampleService;

@Component("exampleService")
@WebService(name="exampleService",targetNamespace="http://www.renker.com/ws")
public class ExampleServiceImpl implements IExampleService{

	public String Hellow(String msg) {
		return "Server response :"+ (msg == null? "NULL":msg);
	}

}
