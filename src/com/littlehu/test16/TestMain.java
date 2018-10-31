package com.littlehu.test16;

import java.util.function.Function;

public class TestMain {
	public  TestMain() {
		Function<String, String> func1=x->{System.out.println(this);return x;};
		System.out.println(func1.apply("littlehu"));
	}
	
	public String toString(){
		return "Main";
		
	}
	public static void main(String[] args) {
		new TestMain();
	}
	
	

}
