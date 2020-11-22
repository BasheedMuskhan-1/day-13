package com.src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

 class FileExTest {

	@Test
	public void testFile() {
		FileEx f=new FileEx();
		String actualvalue=f.display("Muss");
		String expectedvalue="Muss";
		assertEquals(expectedvalue,actualvalue);
	}

	
 }
