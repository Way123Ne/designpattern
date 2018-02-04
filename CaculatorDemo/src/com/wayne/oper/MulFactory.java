package com.wayne.oper;

import com.wayne.inter.IFactory;
import com.wayne.operation.Operation;
import com.wayne.operclass.OperationMul;

/**
 * 乘法工厂类
 * @author Wayne
 *
 */
public class MulFactory implements IFactory {
	
	public Operation CreateOperation() {
		
		return new OperationMul();
	}
}
