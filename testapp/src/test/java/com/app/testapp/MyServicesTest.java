package com.app.testapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class MyServicesTest {
	MyServices myService = null;
	
	public MyServicesTest() {
		myService = new MyServices();
	}
	
	@Test
	public void sayHelloTest() {
		Assertions.assertEquals("Hello Satyam", myService.sayHello("Satyam"));
	}
	
	@Test
	public void addTest() {
		Assertions.assertEquals(50, myService.add(20, 30));
	}
	
	@Test
	public void objectShouldNotBeNull() {
		Assertions.assertNotNull(myService);
	}
}
