package com.wayne.decoratortest;

import com.wayne.decorated.Son;
import com.wayne.decorator.Father;
import com.wayne.decorator.Monther;

/*
 * 装饰者模式Test:
 * 1>Work.java接口
 * 2>Son.java被装饰者-负责画画
 * 3>Monther.java装饰者-负责上颜色
 * 4>Father.java装饰者-负责装画框
 * 5>DecoratorTest.java带有main方法的测试类
 */

public class DecoratorTest {

	public static void main(String[] args) {
		Son s = new Son();
		s.work();
		System.out.println("_____________________");
		Monther m = new Monther(s);
		m.work();
		System.out.println("_____________________");
		//Father f = new Father(Work worker)-> new Father()指向class Father的构造函数
		Father f = new Father(m);
		f.work();
		System.out.println("_____________________");
		
  }
}
