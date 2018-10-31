package com.littlehu.test07;

public class TestMain {
	public static void main(String[] args) {
		Processor processor=(String text)->text.length();
		String name="È­ÍõÌ©É­";
		int length = processor.getStringLength(name);
		System.out.println("The name.length is "+length);
	}

}
