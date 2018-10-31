package com.littlehu.test14;

import java.util.Arrays;
import java.util.function.IntFunction;

public class TestMain3 {
	public static void main(String[] args) {
		IntFunction<int[][]> intFunction=int[][]::new;
		int[][] intArray = intFunction.apply(5);
		
		intArray[0]=new int[5];
		intArray[1]=new int[5];
		intArray[2]=new int[5];
		intArray[3]=new int[5];
		intArray[4]=new int[5];
		
		System.out.println(Arrays.deepToString(intArray));
	}

}
