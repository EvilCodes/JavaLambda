package com.littlehu.test01;

public class TestMain {
	public static void main(String[] args) {
		MyIntegerCaculator myIntegerCaculator=(Integer s1)->s1*2;
		System.out.println("1-Result x2:"+myIntegerCaculator.calcIt(10));
	}

}
