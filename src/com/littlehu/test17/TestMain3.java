package com.littlehu.test17;

import java.util.function.Function;

public class TestMain3 {
	static String x="hello";
	public static void main(String[] args) {
		//lambda���ʽ�п��Ըı�ȫ�ֱ�����ֵ
		Function<String, String> func=y->{x="nihao";return x+" "+y;};
		String result = func.apply("littlehu");
		System.out.println(result);
		
	}

}
