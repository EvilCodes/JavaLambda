package com.littlehu.test09;

import java.util.function.Function;

public class TestMain {
	public static void main(String[] args) {
		
		Function<Integer, String> func1=x->Integer.toBinaryString(x);
		System.out.println(func1.apply(1));
		
		
		
		Function<String, Integer> func2=x->Integer.parseInt(x);
		System.out.println(func2.apply("345"));
		
		
	}

}
