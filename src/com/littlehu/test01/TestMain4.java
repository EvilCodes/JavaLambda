package com.littlehu.test01;

public class TestMain4 {
	public static void main(String[] args) {
		//省略括号和参数类型
		Processor processor=str->str.length();
		String name="Bob";
		int length = processor.getStringLength(name);
		System.out.println("The name.length is "+length);
		
	}

}
