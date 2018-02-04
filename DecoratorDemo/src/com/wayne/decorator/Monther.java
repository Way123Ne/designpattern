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
		System.out.println("母亲的工作就是在儿子的基础上做一个增强,不单止可以画画,还可以上颜色");
	}

}
