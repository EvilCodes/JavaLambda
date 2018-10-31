package com.littlehu.test09;

import java.util.function.BiFunction;

public class TestMain2 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> func1=(x,y)->Integer.sum(x, y);
		System.out.println(func1.apply(2, 3));
		
		BiFunction<Integer, Integer, Integer> func2=Integer::sum;
		System.out.println(func2.apply(2, 3));
		
		
	}

}
