package com.MockitoCourse.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper stringHelper;
	
	@Before
	public void before() {
		stringHelper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPosition() {
		
		
		
		//AACD => CD ACD => CD CDEF => CDEF CDAA=>CDAA
		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {

		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}
	
	
	
	@Test
	public void testTruncateAInFirst2Positions_AinLastTwoPosition() {

		
		assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"));
	}
	
	
	
	//ABCD => false ABAB=> True AB=> true B=>False
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_True() {
		String actual = "ABAB";
		Boolean response = stringHelper.areFirstAndLastTwoCharactersTheSame(actual);
		assertTrue(response);
		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_False() {
		String actual = "ABCD";
		Boolean response = stringHelper.areFirstAndLastTwoCharactersTheSame(actual);
		assertFalse(response);
		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_singleValue() {
		Boolean response = stringHelper.areFirstAndLastTwoCharactersTheSame("B");
		assertFalse(response);
		
	}
		
}
