package com.org.test;

import junit.framework.Assert;

import org.junit.Test;

import com.org.util.StringBufferUtil;


public class StringBufferUtilTest1 {

	@Test
	public void appendTestValid() {

		StringBufferUtil bufferUtil = new StringBufferUtil();
		bufferUtil.append("Hi");
		bufferUtil.append("hallow");

		System.out.println(bufferUtil);
		Assert.assertEquals("[Hi, hallow]",bufferUtil);
	}
	@Test
	public void appendTestNull() {

		StringBufferUtil bufferUtil = new StringBufferUtil();
		bufferUtil.append(null);
		bufferUtil.append(null);

		Assert.assertEquals("[]",bufferUtil.toString());
	}
	
	@Test
	public void appendTestEmpty() {

		StringBufferUtil bufferUtil = new StringBufferUtil("");

		Assert.assertEquals("[]",bufferUtil.toString());
	}
	
	@Test
	public void appendTestContructor() {

		StringBufferUtil bufferUtil = new StringBufferUtil("hi");

		Assert.assertEquals("[hi]",bufferUtil.toString());
	}
	
	@Test
	public void appendTestInBetweenNullCheck() {

		StringBufferUtil bufferUtil = new StringBufferUtil("hi");
		bufferUtil.append(null);
		bufferUtil.append("hallow");
		Assert.assertEquals("[hi, hallow]",bufferUtil.toString());
	}
}
