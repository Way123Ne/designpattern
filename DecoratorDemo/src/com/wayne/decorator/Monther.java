package com.wayne.decorator;

import com.wayne.inter.Work;

public class Monther implements Work{

	Work worker;
	
	public Monther(Work worker){
		super();
		this.worker = worker;
	}
	
	@Override
	public void work() {
		worker.work();
		// TODO Auto-generated method stub
		System.out.println("ĸ�׵Ĺ��������ڶ��ӵĻ�������һ����ǿ,����ֹ���Ի���,����������ɫ");
	}

}
