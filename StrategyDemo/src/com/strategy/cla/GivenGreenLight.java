package com.strategy.cla;

import com.strategy.inter.Strategy;

public class GivenGreenLight implements Strategy{

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("求吴国太开个绿灯,放行");
	}

}
