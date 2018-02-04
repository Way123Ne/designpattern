package com.bianyiclass.cn;

import com.observer.inter.Observer;

public class Bianyi1 implements Observer{

	//声明出姓名
	private String bname = "张浩天";
	
	@Override
	public void update(String message, String name) {
		// TODO Auto-generated method stub
		System.out.println(bname + ":" + name + "那里有新情况:" + message);
	}

}
