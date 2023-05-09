package com.MockitoCourse.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	
	@Before
	public void setup() {
		System.out.println("Before Method");	
	}
	@After
	public void after() {
		System.out.println("After Method");
	}
	@Test
	public void test1() {
		System.out.println("Execute test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Execute test2");
	}

}
