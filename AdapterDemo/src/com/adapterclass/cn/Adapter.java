package com.adapterclass.cn;

import com.adapter.inter.Computer;
import com.adapter.inter.Power;
/*
 * ����������(��������Ϊ��Ϊ������,Ӧ��ͬʱ������������������ӿ�,
 * һ���ǵ�Դ�ӿ�,��һ���ǵ��Խӿ�)
 */
public class Adapter implements Computer, Power {
	Computer computer;
	Power power;

	public Adapter(Computer computer){
		super();
		this.computer = computer;
	}
	public Adapter(Power power){
		super();
		this.power = power;
	}
	
	//����дһ��д
	/*public Adapter(Computer computer, Power power) {
		super();
		this.computer = computer;
		this.power = power;
	}
*/
	@Override
	public void electric() {
		// TODO Auto-generated method stub
		computer.battery();
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		power.electric();
	}

}
