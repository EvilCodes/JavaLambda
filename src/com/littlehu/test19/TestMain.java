package com.littlehu.test19;

import java.util.function.IntFunction;

public class TestMain {
	public static void main(String[] args) {
		IntFunction<Long> intFunction=TestMain::factorial;
		Long result = intFunction.apply(10);
		System.out.println("result is "+result);
	}
	
	public static long factorial(int n){
		if (n==0) {
			return 1;
			
		}else {
			return n*factorial(n-1);
		}
	}

}
