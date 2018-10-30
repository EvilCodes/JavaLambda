package com.littlehu.test02;

import java.util.concurrent.SynchronousQueue;

public class TestMain {
	public static void main(String[] args) {
		Processor processor=(String name)->name.length();
		SecondProcessor secondProcessor=(String name)->name.length();
		String name="¿Ó–°¡˙";
		String kuangfu="”Ω¥∫";
		int length1 = processor.getNameLength(name);
		int length2 = secondProcessor.noName(kuangfu);
		System.out.println("length1="+length1+",length2="+length2);
		
		
		
	}

}
