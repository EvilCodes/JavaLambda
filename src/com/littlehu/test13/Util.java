package com.littlehu.test13;

import java.util.function.BiFunction;

public class Util extends ParentUtil{
	public Util(){
		BiFunction<String, String, String> function=this::append;
		String name="com.littlehu.cn";
		String result = function.apply(name, " this is a dog");
		System.out.println(result);
		
		
		function=Util.super::append;
		String result1 = function.apply(name, " is a dog");
		System.out.println(result1);
		
	}
	
	@Override
	public String append(String s1, String s2) {
		System.out.println("child append");
		return s1+s2;
	}

}
