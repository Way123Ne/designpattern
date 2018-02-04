package com.wayne.decorator;

import com.wayne.inter.Work;

public class Father implements Work{
Work worker;
//将妈妈对象m传给worker,此处为多态~接口与对象(对象是类的具体体现形式))
public Father(Work worker){
	//覆盖接口Work的空构造方法
	super();
	//将妈妈对象m赋给class Father的属性,且该属性的数据类型为引用数据类型-接口
	this.worker = worker;
}

@Override
public void work() {
	//此处的worker已经变为妈妈对象m
	worker.work();
	// TODO Auto-generated method stub
	System.out.println("父亲的工作就是在妈妈的基础上作了增强,不单止可以画画,而且可以上颜色,还可以装画框");
}

	
}
