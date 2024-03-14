package com.learning;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import org.junit.Assert.*;

import learning.ReverseString;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse = new ReverseString();
		Assert.assertEquals("avaJ", reverse.reverseString("Java"));
		
	}

}
