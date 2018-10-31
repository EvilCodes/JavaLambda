package com.littlehu.test05;

public class TestMain2 {
	public static void main(String[] args) {
		Calculator calculator=create();
		long result = calculator.calculate(3, 9);
		System.out.println("The result is "+result);
		
	}
	
	private static Calculator create(){
		return (long x,long y)->x*y;
	}

}
