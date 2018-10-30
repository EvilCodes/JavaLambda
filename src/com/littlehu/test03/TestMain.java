package com.littlehu.test03;

public class TestMain {
	public static void main(String[] args) {
		engine((x,y)->x+y);
		engine((x,y)->x*y);
		engine((x,y)->x-y);
		engine((x,y)->x/y);
	}
	
	private static void engine(Calculator calculator){
		int x=2,y=4;
		int result = calculator.caculate(x, y);
		System.out.println("The result is "+result);
	}
	

}
