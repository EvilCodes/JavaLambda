package com.littlehu.test01;

public class TestMain5 {
	public static void main(String[] args) {
		Processor processor=(final String str)-> str.length();
		String name="超级赛亚人";
		int length = processor.getStringLength(name);
		System.out.println("The Name.Length is "+length);
	}

}
