package com.littlehu.test06;

public class TestMain {
	public static void main(String[] args) {
		engine((IntCalculator)(x,y)->x-y);
		
		
	}
	
	private static void engine(IntCalculator intCalculator){
		int x=4,y=10;
		int result = intCalculator.calculate(x, y);
		System.out.println("The result is "+result);
	}
	
	private static void engine(LongCalculator longCalculator){
		long x=8,y=28;
		int result = longCalculator.calculate(x, y);
		System.out.println("The result is "+result);
	}

}
