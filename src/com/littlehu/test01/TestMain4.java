package com.littlehu.test01;

public class TestMain4 {
	public static void main(String[] args) {
		//ʡ�����źͲ�������
		Processor processor=str->str.length();
		String name="Bob";
		int length = processor.getStringLength(name);
		System.out.println("The name.length is "+length);
		
	}

}
