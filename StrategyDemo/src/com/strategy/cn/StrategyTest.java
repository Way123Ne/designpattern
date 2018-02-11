package com.strategy.cn;

import com.context.cn.Context;
import com.strategy.cla.BlackEnemy;
import com.strategy.cla.GivenGreenLight;
import com.strategy.cla.JustArrived;

public class StrategyTest {

	public static void main(String[] args){
		Context context;
		
		System.out.println("---�յ����ʹ�õ�һ������---");
		Context ct = new Context(new JustArrived());
		ct.operate();
		System.out.println("\n");
		
		System.out.println("---�����ֲ�˼��ʹ�õڶ�������---");
		Context ct2 = new Context(new GivenGreenLight());
		ct2.operate();
		System.out.println("\n");
		
		System.out.println("---��Ȩ��׷������,ʹ�õ���������---");
		Context ct3 = new Context(new BlackEnemy());
		ct3.operate();
		System.out.println("\n");
	}
}
