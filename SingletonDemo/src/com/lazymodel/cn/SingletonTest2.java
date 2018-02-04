package com.lazymodel.cn;

public class SingletonTest2 {

	public static void main(String[] args) {
		SingletonDemo2 s3 = SingletonDemo2.getInstance();
		SingletonDemo2 s4 = SingletonDemo2.getInstance();
		
		if (s3 == s4) {
			System.out.println("s3和s4是同一个对象");
		}
		else {
			System.out.println("s3和s4不是同一个对象");
		}
		
	}
	
}
