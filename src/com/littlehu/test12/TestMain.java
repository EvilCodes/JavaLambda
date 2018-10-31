package com.littlehu.test12;

import java.util.function.BiFunction;

public class TestMain {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction=Util::append;
		String result = biFunction.apply("My name is", "LiMing");
		System.out.println("result="+result);
	}

}
