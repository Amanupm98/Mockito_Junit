package com.MockitoCourse.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort() {
		int [] actual = {12,2,1,3};
		int [] expected = {1,2,3,12};
		
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		
		
	}

}
