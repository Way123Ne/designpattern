package com.adaptertest.cn;

import com.adapter.inter.Computer;
import com.adapter.inter.Power;
import com.adapterclass.cn.Adapter;
import com.interfaceclass.cn.PowerImpl;

public class AdapterTest2 {
/*
 * ����ģ�����е���(���)�������(��������һ���Ѿ����ӵ���),ͨ������������power�Ĺ���
 */
	public static void main(String[] args){
		//��̬(interface&&class):ʵ����Power(��������ָ������)
		Power power = new PowerImpl();
		//ʵ����������,�����Ϊ����һ�����ӵ����ԵĹ���
		Adapter a = new Adapter(power);
		method(a);
	}

	public static void method(Computer c) {
		// TODO Auto-generated method stub
		c.battery();
	}
}
