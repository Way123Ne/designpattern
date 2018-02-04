package com.wayne.client;

import com.wayne.inter.IFactory;
import com.wayne.oper.AddFactory;
import com.wayne.operation.Operation;

public class Caculator {

	public static void main(String[] args){
		IFactory operFactory = new AddFactory();
		Operation oper = (Operation) operFactory.CreateOperation();
		oper.setNumberA(10);
		oper.setNumberB(7);
		double result = oper.getResult();
		System.out.println(result);
	}
}
