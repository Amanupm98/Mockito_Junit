package com.MockitoCourse.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PerformanceTest {

	@Test(timeout = 1)
	public void testSort_Performance() {
		int[] array = {12,67,90};
		
		for (int i=0; i<=1000000; i++) {
			
			array[0] = i;
		}
		Arrays.sort(array);
	}

}
