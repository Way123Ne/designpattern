package com.observer.inter;

public interface Huairen {

	// 添加便衣观察者
	void addObserver(Observer observer);

	// 移除便衣观察者
	void removeObserver(Observer observer);

	// 通知观察者
	void notice(String message);

}
