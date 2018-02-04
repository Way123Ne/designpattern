package com.adapterclass.cn;

import com.adapter.inter.Computer;
import com.adapter.inter.Power;
/*
 * 建造适配器(这里我认为作为适配器,应该同时连接它所适配的两个接口,
 * 一个是电源接口,另一个是电脑接口)
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
	
	//或者写一起写
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
