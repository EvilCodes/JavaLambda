package com.littlehu.test11;

import java.util.function.Function;

public class TestMain2 {
	public static void main(String[] args) {
		Function<String, Integer> function=String::length;
		String name="com.littlehu.cn";
		Integer length = function.apply(name);
		System.out.println("name="+name+"£¬length="+length);
		
		
	}

}
