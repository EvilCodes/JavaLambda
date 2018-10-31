package com.littlehu.test05;

public class TestMain {
	public static void main(String[] args) {
		engine((long x, long y)->x+y);
		
	}

	private static void engine(Calculator calculator){
		long x=5,y=9;
		long result = calculator.calculate(x, y);
		System.out.println("The result is "+result);
		
	}
}
