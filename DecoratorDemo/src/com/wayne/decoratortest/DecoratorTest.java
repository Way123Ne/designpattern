package com.wayne.decoratortest;

import com.wayne.decorated.Son;
import com.wayne.decorator.Father;
import com.wayne.decorator.Monther;

/*
 * װ����ģʽTest:
 * 1>Work.java�ӿ�
 * 2>Son.java��װ����-���𻭻�
 * 3>Monther.javaװ����-��������ɫ
 * 4>Father.javaװ����-����װ����
 * 5>DecoratorTest.java����main�����Ĳ�����
 */

public class DecoratorTest {

	public static void main(String[] args) {
		Son s = new Son();
		s.work();
		System.out.println("_____________________");
		Monther m = new Monther(s);
		m.work();
		System.out.println("_____________________");
		//Father f = new Father(Work worker)-> new Father()ָ��class Father�Ĺ��캯��
		Father f = new Father(m);
		f.work();
		System.out.println("_____________________");
		
  }
}
