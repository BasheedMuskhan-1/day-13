package com.bank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class FourthTest {

	@Test
	void testGetAccountNumber() {
		Account a=new Account("hello",123456789,2300);
		long b=a.getAccountNumber();
		assertEquals(b,123456789);
	}

}