package com.renker.ws.service.impl;

import com.renker.ws.service.IExampleService;

public class ExampleServiceImpl implements IExampleService{

	public String Hellow(String msg) {
		return "Server response :"+ msg == null? "NULL":msg;
	}

}
