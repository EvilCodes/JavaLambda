package com.littlehu.test11;

import java.util.function.Consumer;

public class TestMain {
	public static void main(String[] args) {
		Util util=new Util();
		Consumer<String> consumer=str->util.print(str);
		consumer.accept("hello");
		
		
		Consumer<String> consumer2=util::print;
		consumer2.accept("com.littlehu.cn");
		
		util.debug();
		
		
		
	}


}
