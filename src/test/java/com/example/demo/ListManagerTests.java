package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListManagerTests {
	
	
	ListManager manager;
	
	@Before
	public void startUp() {
		manager = new ListManager();
	}
	
	@Test
	public void removeItem() {
		manager.addItem("ammon");
		manager.removeItem("ammon");
		assertEquals(0,manager.getItems().size());
		
		
	}
	
	@Test
	public void addItem() {
		manager.addItem("ammon");
		assertEquals(1,manager.getItems().size());
		
		
	}

}
