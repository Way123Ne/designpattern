package com.wayne.decorator;

import com.wayne.inter.Work;

public class Father implements Work{
Work worker;
//���������m����worker,�˴�Ϊ��̬~�ӿ������(��������ľ���������ʽ))
public Father(Work worker){
	//���ǽӿ�Work�Ŀչ��췽��
	super();
	//���������m����class Father������,�Ҹ����Ե���������Ϊ������������-�ӿ�
	this.worker = worker;
}

@Override
public void work() {
	//�˴���worker�Ѿ���Ϊ�������m
	worker.work();
	// TODO Auto-generated method stub
	System.out.println("���׵Ĺ�������������Ļ�����������ǿ,����ֹ���Ի���,���ҿ�������ɫ,������װ����");
}

	
}
