package com.hungermodel.cn;

public class SingletonTest1 {

	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		
		//�ж�s1��s2������ڴ��ַ�Ƿ�һ��
		if (s1 == s2) {
			System.out.println("s1��s2��ͬһ������");
		}
		else {
			System.out.println("s1��s2����ͬһ������");
		}
	}
}
