package com.littlehu.test17;

import java.util.function.Function;

public class TestMain {
	public static void main(String[] args) {
		final String x="Hello";
		Function<String, String>func=y->{return y+""+x;};
		String result = func.apply("littlehu ");
		System.out.println(result);
	}

}
