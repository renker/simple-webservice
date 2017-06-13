package com.renker.ws.service;

import javax.jws.WebService;

@WebService(name="exampleService",targetNamespace="http://www.renker.com/ws")
public interface IExampleService {
	public String Hellow(String msg);
}
