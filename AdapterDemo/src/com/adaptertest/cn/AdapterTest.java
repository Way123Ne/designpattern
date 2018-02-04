package com.adaptertest.cn;

import com.adapter.inter.Computer;
import com.adapter.inter.Power;
import com.adapterclass.cn.Adapter;
import com.interfaceclass.cn.ComputerImpl;
/*
 *适配器:类适配器;对象适配器
 *C#,VB.NET,JAVA等语言不支持多重继承，因此对java来说主要讲对象适配器
 */
public class AdapterTest {
/*
 * 这里模拟在有电的情况下(即适配器一端已经连接电源插板),通过适配器调用电脑电池的过程
 */
	public static void main(String[] args){
		//多态(interface&&class):实例话ComputerImpl(父类引用指向子类)
		Computer computer = new ComputerImpl();
		//实例话适配器,可理解为将另一端连接到电脑的过程
		Adapter a = new Adapter(computer);
		method(a);
	}

	public static void method(Power p) {
		// TODO Auto-generated method stub
		p.electric();
	}
}
