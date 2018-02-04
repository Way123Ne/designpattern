package com.xianfanclass.cn;

import java.util.ArrayList;
import java.util.List;

import com.observer.inter.Huairen;
import com.observer.inter.Observer;

public class XianFan1 implements Huairen {

	//嫌犯别称
	private String name = "大熊";
	//定义观察者集合
	private List<Observer> observerList = new ArrayList<Observer>();
	
	//增加观察者
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (!observerList.contains(observer)){
			observerList.add(observer);
		}
	}

	//移除观察者
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (observerList.contains(observer)){
			observerList.remove(observer);
		}
	}

	//通知观察者
	@Override
	public void notice(String message) {
		// TODO Auto-generated method stub
		for(Observer observer:observerList){
			observer.update(message, name);
		}
	}

}
