package com.littlehu.test16;

import java.util.function.Function;

public class TestMain2 {
	public TestMain2(){
		Function<String, String> func1=x->{System.out.println(this);return x;};
		System.out.println(func1.apply(""));
	}
	
	@Override
	public String toString() {
		return "TestMain2";
	}
	
	
	public static void main(String[] args) {
		new TestMain2();
	}

}
