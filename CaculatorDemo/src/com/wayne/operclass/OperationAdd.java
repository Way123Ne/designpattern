package com.wayne.operclass;

import com.wayne.operation.Operation;

public class OperationAdd extends Operation{
	
	public double getResult(){
		double result = 0;
		result = super.getNumberA() + super.getNumberB();
		return result;
	}

}
