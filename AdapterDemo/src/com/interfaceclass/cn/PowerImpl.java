package com.interfaceclass.cn;

import com.adapter.inter.Power;
/*
 * 建立一个实现电源接口的类
 */
public class PowerImpl implements Power{

	@Override
	public void electric() {
		// TODO Auto-generated method stub
		System.out.println("我有电");
	}

}
