package com.littlehu.test18;

import java.util.function.Function;

public class TestMain {
	public static void main(String[] args) {
		Function<String, String> function=y->{
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i==4) {
					break;
				}
				
			}
			return y+"from www.littlehu.cn";
			
			
		};
		System.out.println(function.apply("this little dog is "));
	}

}
