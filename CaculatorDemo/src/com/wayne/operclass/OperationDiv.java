package com.wayne.operclass;

import com.wayne.operation.Operation;

public class OperationDiv extends Operation{

	public double getResult(){
		double result = 0;
		if (super.getNumberB() == 0)
			throw new ArithmeticException("��������Ϊ0");
		result = super.getNumberA() / super.getNumberB();
		return result;
	}
}
