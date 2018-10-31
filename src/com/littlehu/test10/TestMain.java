package com.littlehu.test10;

import java.util.function.Supplier;

public class TestMain {
	public static void main(String[] args) {
		Supplier<Integer> supplier=()->"https://github.com/EvilCodes".length();
		System.out.println(supplier.get());
		
		Supplier<Integer> supplier2="https://github.com/EvilCodes"::length;
		System.out.println(supplier2.get());
		
	}

}
