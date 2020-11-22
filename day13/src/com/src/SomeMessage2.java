package com.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeMessage2 {
	
	String message="Hello";
	SomeMessage sm1=new SomeMessage(message);
	@Test
	public void testappendMessage() {
		assertEquals(message,sm1.appendMessage());
	}

}
