package com.wayne.oper;

import com.wayne.inter.IFactory;
import com.wayne.operation.Operation;
import com.wayne.operclass.OperationSub;

/**
 * 加法类工厂
 * @author Wayne
 *
 */
public class SubFactory implements IFactory{

	public Operation CreateOperation() {
		
		return new OperationSub();
	}
}
