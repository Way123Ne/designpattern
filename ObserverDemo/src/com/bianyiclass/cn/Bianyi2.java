package com.bianyiclass.cn;

import com.observer.inter.Observer;

public class Bianyi2 implements Observer {

	//��������
	private String bname = "ʯ����";
	@Override
	public void update(String message, String name) {
		// TODO Auto-generated method stub
		System.out.println(bname + ":" + name + "�����������:" + message);
	}

}
