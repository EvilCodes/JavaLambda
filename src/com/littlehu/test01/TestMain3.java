package com.littlehu.test01;

public class TestMain3 {

	public static void main(String[] args) {
		Processor processor=(content)->content.length();
		String name="Little Hu";
		int length = processor.getStringLength(name);
		System.out.println("The Name.Length is "+length);
		
	}
}
