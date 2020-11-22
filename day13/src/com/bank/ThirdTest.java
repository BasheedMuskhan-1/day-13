package com.bank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class ThirdTest {

	@SuppressWarnings("deprecation")
	@Test
	void testAddInterest() {
		Account a=new Account("hello",123456789,2000);
		a.addInterest();
		float f=a.getBalance();
		float bal=2000+(2000*0.045f);
		assertEquals(f,bal);
	}

}