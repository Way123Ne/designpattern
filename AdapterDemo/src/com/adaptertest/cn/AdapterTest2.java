package com.adaptertest.cn;

import com.adapter.inter.Computer;
import com.adapter.inter.Power;
import com.adapterclass.cn.Adapter;
import com.interfaceclass.cn.PowerImpl;

public class AdapterTest2 {
/*
 * 这里模拟在有电脑(电池)的情况下(即适配器一端已经连接电脑),通过适配器调用power的过程
 */
	public static void main(String[] args){
		//多态(interface&&class):实例化Power(父类引用指向子类)
		Power power = new PowerImpl();
		//实例话适配器,可理解为将另一端连接到电脑的过程
		Adapter a = new Adapter(power);
		method(a);
	}

	public static void method(Computer c) {
		// TODO Auto-generated method stub
		c.battery();
	}
}
