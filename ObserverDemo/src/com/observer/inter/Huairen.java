package com.observer.inter;

public interface Huairen {

	// ��ӱ��¹۲���
	void addObserver(Observer observer);

	// �Ƴ����¹۲���
	void removeObserver(Observer observer);

	// ֪ͨ�۲���
	void notice(String message);

}
