package com.littlehu.test03;

public class TestMain2 {
	public static void main(String[] args) {
//		engine((x,y)->x*y); ������������ʽ�ӿڷ����������Ͳ�ͬ���Բ����ж����Ǹ��ӿ�
		engine((int x,int y)->x*y);
		engine((long x,long y)->x+y);
		engine((int x, int y)->x/y);
		engine((int x,int y)->x-y);
		engine((long x,long y)->x/y);
		engine((int x,int y)->x%y);
		
	}
	
	private static void engine(IntCalculator intCalculator){
		int x=2,y=4;
		int result = intCalculator.calculate(x, y);
		System.out.println("engine.intCalculator.result="+result);
		
	}
	
	private static void engine(LongCalculator longCalculator){
		int x=2,y=4;
		long result = longCalculator.calculate(x, y);
		System.out.println("engine.longCalculator.result"+result);
		
	}

}
