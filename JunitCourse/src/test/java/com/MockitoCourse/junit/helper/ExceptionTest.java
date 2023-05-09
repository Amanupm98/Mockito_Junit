package com.MockitoCourse.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ExceptionTest {

	
			@Test (expected = NullPointerException.class)
			public void testException() {
				int [] actual = null;
				int [] expected = {1,2,3,12};
				
				Arrays.sort(actual);
				assertArrayEquals(expected, actual);
				
				
			}
	
}
