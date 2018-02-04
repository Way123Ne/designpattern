package com.bianyiclass.cn;

import com.observer.inter.Observer;

public class Bianyi2 implements Observer {

	//声明姓名
	private String bname = "石破天";
	@Override
	public void update(String message, String name) {
		// TODO Auto-generated method stub
		System.out.println(bname + ":" + name + "那里有新情况:" + message);
	}

}
