package com.littlehu.test01;
/**
 * 
 * @author blackfox
 * @desc lambda���ʽ��˵����
 * 			1. ��ȷ�����Ľṹ(parameters)->{}
 * 			2. ע��ӿ���ʹ�õ���ط�ʽ�ұ�ֱ��ʡ��new�Ĳ���
 * 			         Ϊ�ӿ��еķ�������
 * 
 *
 */
public class TestMain2 {
	public static void main(String[] args) {
		MyIntegerCaculator myIntegerCaculator=(s1)->s1*2;
		System.out.println("The Result is "+myIntegerCaculator.calcIt(10));
	}

}
