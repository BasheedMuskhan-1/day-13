package com.bank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class SecondTest {

	@Test
	void testWithdraw() {
		Account a=new Account("hello",123456789,2300);
		boolean b=a.withdraw(200, 20);
		assertEquals(b,true);
	}

}