package com.xianfanclass.cn;

import java.util.ArrayList;
import java.util.List;

import com.observer.inter.Huairen;
import com.observer.inter.Observer;

public class XianFan1 implements Huairen {

	//�ӷ����
	private String name = "����";
	//����۲��߼���
	private List<Observer> observerList = new ArrayList<Observer>();
	
	//���ӹ۲���
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (!observerList.contains(observer)){
			observerList.add(observer);
		}
	}

	//�Ƴ��۲���
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (observerList.contains(observer)){
			observerList.remove(observer);
		}
	}

	//֪ͨ�۲���
	@Override
	public void notice(String message) {
		// TODO Auto-generated method stub
		for(Observer observer:observerList){
			observer.update(message, name);
		}
	}

}
