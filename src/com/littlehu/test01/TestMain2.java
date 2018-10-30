package com.littlehu.test01;
/**
 * 
 * @author blackfox
 * @desc lambda表达式的说明：
 * 			1. 明确基本的结构(parameters)->{}
 * 			2. 注意接口中使用的相关方式右边直接省略new的部分
 * 			         为接口中的方法调用(忽略方法名称只有方法参数，以及->方法的具体实现)
 * 
 *
 */
public class TestMain2 {
	public static void main(String[] args) {
		MyIntegerCaculator myIntegerCaculator=(s1)->s1*2;
		System.out.println("The Result is "+myIntegerCaculator.calcIt(10));
	}

}
