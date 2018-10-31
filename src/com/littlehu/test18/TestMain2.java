package com.littlehu.test18;

import java.util.function.Function;

public class TestMain2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==4) {
				Function<String, String> function=y->{
					return y+" from www.littlehu.com";
				};
				System.out.println(function.apply("this dog is"));
				
			}
			
		}
	}

}
