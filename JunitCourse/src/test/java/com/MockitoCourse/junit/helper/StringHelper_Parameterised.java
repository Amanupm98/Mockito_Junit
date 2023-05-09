package com.MockitoCourse.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelper_Parameterised {
	
	StringHelper stringHelper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	public StringHelper_Parameterised(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> test_Conditions() {
		String expectedOutputs[][] = {{"AACD","CD"},{"ACD","CD"}};
		
		return Arrays.asList(expectedOutputs);	
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPosition() {
		
		//AACD => CD ACD => CD CDEF => CDEF CDAA=>CDAA
		
		assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
	}
	
	

}
