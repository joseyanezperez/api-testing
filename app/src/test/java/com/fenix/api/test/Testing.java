package com.fenix.api.test;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class Testing {

	 static int i=0;
	
	 @BeforeAll
	 public static void runBefore(){
		 i++;
	 }
	
	@Test
	public void test1() {
		assertEquals(i, 1);
	}

}
