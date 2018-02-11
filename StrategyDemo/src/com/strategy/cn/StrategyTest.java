package com.strategy.cn;

import com.context.cn.Context;
import com.strategy.cla.BlackEnemy;
import com.strategy.cla.GivenGreenLight;
import com.strategy.cla.JustArrived;

public class StrategyTest {

	public static void main(String[] args){
		Context context;
		
		System.out.println("---刚到吴国使用第一个锦囊---");
		Context ct = new Context(new JustArrived());
		ct.operate();
		System.out.println("\n");
		
		System.out.println("---刘备乐不思蜀使用第二个锦囊---");
		Context ct2 = new Context(new GivenGreenLight());
		ct2.operate();
		System.out.println("\n");
		
		System.out.println("---孙权的追兵来了,使用第三个锦囊---");
		Context ct3 = new Context(new BlackEnemy());
		ct3.operate();
		System.out.println("\n");
	}
}
