package com.hungermodel.cn;

public class SingletonDemo1 {
	/*
	 * 饿汉式特点:
	 * 1>在加载类的时候比较慢，由于它还要去实例化一个对象并造成内存资源的浪费，但在运行调用中的速度会比较快。
	 * 2>饿汉模式是属于线程安全
	 */
	
	//将构造方法私有化，阻止外界直接创建对象
	private SingletonDemo1() {
		
	}
	//提供static以便外界访问
	//这个实例是被static所修饰，被static修饰的成员属于类所有，当类加载的时候，这个成员就被加载了，也就是说不管外界是否调用这个类，它都已经被加载了。
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	//提供getInstance()以便外界访问私有化对象，SingletonDemo1返回值类型
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
