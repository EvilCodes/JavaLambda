package com.littlehu.test03;

public class TestMain3 {
	public static void main(String[] args) {
		IntCalculator iCal=(x,y)->x+y;
		engine(iCal);
		engine((long x,long y)->x*y);
		engine((int x,int y)->x+y);
		engine((long x,long y)->x/y);
		
	}
	
	private static void engine(IntCalculator intCalculator){
		
		int x=2,y=4;
		int result = intCalculator.calculate(x, y);
		System.out.println("The result is "+result);
	}
	
	private static void engine(LongCalculator longCalculator){
		long x=2,y=4;
		long result = longCalculator.calculate(x, y);
		System.out.println(result);
	}

}
