package com.wayne.oper;


import com.wayne.inter.IFactory;
import com.wayne.operation.Operation;
import com.wayne.operclass.OperationDiv;

/**
 * 除法工厂类
 * @author Wayne
 *
 */

public class DivFactory implements IFactory {

	public Operation CreateOperation() {
		
		return new OperationDiv();
	}

}
