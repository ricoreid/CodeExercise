package com.IGDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void AppImplemenation() {
		
		AppImplementation app = new AppImplementation();
		
		assertEquals("1234", app.cipher("4321"));
		
	}

}
