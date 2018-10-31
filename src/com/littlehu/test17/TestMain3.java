package com.littlehu.test17;

import java.util.function.Function;

public class TestMain3 {
	static String x="hello";
	public static void main(String[] args) {
		//lambda表达式中可以改变全局变量的值
		Function<String, String> func=y->{x="nihao";return x+" "+y;};
		String result = func.apply("littlehu");
		System.out.println(result);
		
	}

}
