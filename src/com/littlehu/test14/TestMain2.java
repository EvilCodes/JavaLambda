package com.littlehu.test14;

import java.util.Arrays;
import java.util.function.IntFunction;

public class TestMain2 {
	public static void main(String[] args) {
		/**
		 * 形式一
		 */
		IntFunction<int[]> function=size->new int[size];
		int[] intArray = function.apply(5);
		System.out.println(Arrays.toString(intArray));
		/**
		 * 形式二
		 * 
		 */
		IntFunction<int[]> function2=int[]::new;
		int[] intArray2 = function2.apply(5);
		System.out.println(Arrays.toString(intArray2));
		
		
	}
	
	

}
