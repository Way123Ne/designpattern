package com.wayne.oper;

import com.wayne.inter.IFactory;
import com.wayne.operation.Operation;
import com.wayne.operclass.OperationMul;

/**
 * �˷�������
 * @author Wayne
 *
 */
public class MulFactory implements IFactory {
	
	public Operation CreateOperation() {
		
		return new OperationMul();
	}
}
