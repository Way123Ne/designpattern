package com.hungermodel.cn;

public class SingletonDemo1 {
	/*
	 * ����ʽ�ص�:
	 * 1>�ڼ������ʱ��Ƚ�������������Ҫȥʵ����һ����������ڴ���Դ���˷ѣ��������е����е��ٶȻ�ȽϿ졣
	 * 2>����ģʽ�������̰߳�ȫ
	 */
	
	//�����췽��˽�л�����ֹ���ֱ�Ӵ�������
	private SingletonDemo1() {
		
	}
	//�ṩstatic�Ա�������
	//���ʵ���Ǳ�static�����Σ���static���εĳ�Ա���������У�������ص�ʱ�������Ա�ͱ������ˣ�Ҳ����˵��������Ƿ��������࣬�����Ѿ��������ˡ�
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	//�ṩgetInstance()�Ա�������˽�л�����SingletonDemo1����ֵ����
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
