package com.littlehu.test17;

import java.util.function.Function;

public class TestMain2 {
	public static void main(String[] args) {
		String x="hello";
		Function<String, String>func=y->{/*x="nihao";*/return x+" "+y;};
		String result = func.apply("world");
		System.out.println(result);
		
		
	}

}
