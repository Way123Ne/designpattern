package com.observertest.cn;

import com.bianyiclass.cn.Bianyi1;
import com.bianyiclass.cn.Bianyi2;
import com.bianyiclass.cn.Bianyi3;
import com.observer.inter.Huairen;
import com.observer.inter.Observer;
import com.xianfanclass.cn.XianFan1;
import com.xianfanclass.cn.XianFan2;

public class ObserverTest {

	public static void main(String[] args) {
		Huairen xf1 = new XianFan1();
		Huairen xf2 = new XianFan2();
		// 定义三个观察便衣警察
		Observer o1 = new Bianyi1();
		Observer o2 = new Bianyi2();
		Observer o3 = new Bianyi3();
		
		// 为1个嫌犯指定多个便衣
		xf1.addObserver(o1);
		xf1.addObserver(o2);
		xf1.addObserver(o3);
		//为1个嫌犯指定1个便衣
		xf2.addObserver(o2);
		
		String message1 = "要逃跑";
		String message2 = "已抓捕";
		
		xf1.notice(message1);
		xf2.notice(message2);
		
		
		
		

		// 为对应的嫌犯指定对应的便衣
	}
}
