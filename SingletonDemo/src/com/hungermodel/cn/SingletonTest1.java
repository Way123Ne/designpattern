package com.hungermodel.cn;

public class SingletonTest1 {

	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		
		//判断s1和s2对象的内存地址是否一致
		if (s1 == s2) {
			System.out.println("s1和s2是同一个对象");
		}
		else {
			System.out.println("s1和s2不是同一个对象");
		}
	}
}
