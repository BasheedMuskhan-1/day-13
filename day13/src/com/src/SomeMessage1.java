package com.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeMessage1 {
	String message="muss";
	SomeMessage sm=new SomeMessage(message);
	@Test
	public void testPrintMessage() {
		assertEquals(message,sm.PrintMessage());
	}

}
