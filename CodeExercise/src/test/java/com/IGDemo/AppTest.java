package com.IGDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void AppImplemenation() {
		
		AppImplementation app = new AppImplementation();
		
		assertEquals("depmuj", app.cipher("jumped"));
		
	}

}
