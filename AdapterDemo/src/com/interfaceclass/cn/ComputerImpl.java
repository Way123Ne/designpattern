package com.interfaceclass.cn;

import com.adapter.inter.Computer;
/*
 * 建立一个实现电脑接口的类
 */
public class ComputerImpl implements Computer{

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("我有电池");
	}

	
}
