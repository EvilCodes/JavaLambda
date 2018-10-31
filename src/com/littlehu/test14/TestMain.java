package com.littlehu.test14;

import java.util.function.Function;
import java.util.function.Supplier;

public class TestMain {
	
	public static void main(String[] args) {
		/**
		 * lambda表达式形式一
		 */
		Supplier<String> fun1=()->new String();
		System.out.println("empty string is "+fun1.get());
		
		
		Function<String, String> fun2=(x)->new String(x);
		System.out.println("the content is "+fun2.apply("littlehu"));
		
		/**
		 * lambda表达式形式二
		 */
		Supplier<String> fun3=String::new;
		System.out.println("empty content is "+fun3.get());
		
		
		Function<String, String> fun4=String::new;
		System.out.println("the content is "+fun4.apply("littlehu"));
		
		
	}

}
