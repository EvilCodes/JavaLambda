package com.littlehu.test15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestMain {
	public static void main(String[] args) {
		Function<String[], List<String>> asList=Arrays::asList;
		List<String> result = asList.apply(new String[]{"a","b","c"});
		int i=0;
		for (String string : result) {
			i++;
			System.out.println("µЪ"+i+"По string is "+string);
			
		}
	}

}
