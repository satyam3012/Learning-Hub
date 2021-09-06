package com.myapp.service;

public class MyServiceImpl implements MyService{

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Override
	public int addNumbers(int a, int b) {
		return a+b;
	}
	
}
