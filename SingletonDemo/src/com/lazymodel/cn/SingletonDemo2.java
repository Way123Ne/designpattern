package com.lazymodel.cn;

public class SingletonDemo2 {
/*
 * ����ʽ�ص�:
 * 1>�ڼ������ʱ��ȽϿ죬�����ڼ������ʱ����Ҫȥʵ�������󣬵������е���ʱ���ٶȱȽ��������ڻ�Ҫȥ���жϡ�
 * 2>����ģʽ�����̲߳���ȫ���ڸ߲���ʱ��������⡣
 */
	
	//���췽��˽�л�����ֹ���ֱ��ֱ�Ӵ�������
	private SingletonDemo2() {
		
	}
	//�ṩstatic�Ա�������
	private static SingletonDemo2 instance;
	
	//�ṩgetInstance()�Ա�������˽�л�����,SingletonDemo2��������
	public static SingletonDemo2 getInstance() {
		if (instance == null) {
			return instance = new SingletonDemo2();
		}
		else {
			return instance;
		}
	}
}
