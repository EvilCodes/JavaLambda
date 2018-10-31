package com.littlehu.test09;

import java.util.function.Function;

public class TestMain {
	public static void main(String[] args) {
		
		Function<Integer, String> func1=x->Integer.toBinaryString(x);
		System.out.println(func1.apply(1));
		
		
	}

}
