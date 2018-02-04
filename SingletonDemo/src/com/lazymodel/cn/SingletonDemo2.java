package com.lazymodel.cn;

public class SingletonDemo2 {
/*
 * 懒汉式特点:
 * 1>在加载类的时候比较快，由于在加载类的时候不需要去实例化对象，但在运行调用时的速度比较慢，由于还要去做判断。
 * 2>懒汉模式属于线程不安全，在高并发时会出现问题。
 */
	
	//构造方法私有化，防止外界直接直接创建对象
	private SingletonDemo2() {
		
	}
	//提供static以便外界访问
	private static SingletonDemo2 instance;
	
	//提供getInstance()以便外界访问私有化对象,SingletonDemo2返回类型
	public static SingletonDemo2 getInstance() {
		if (instance == null) {
			return instance = new SingletonDemo2();
		}
		else {
			return instance;
		}
	}
}
