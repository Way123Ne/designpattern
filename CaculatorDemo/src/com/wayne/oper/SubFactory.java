package com.wayne.oper;

import com.wayne.inter.IFactory;
import com.wayne.operation.Operation;
import com.wayne.operclass.OperationSub;

/**
 * �ӷ��๤��
 * @author Wayne
 *
 */
public class SubFactory implements IFactory{

	public Operation CreateOperation() {
		
		return new OperationSub();
	}
}
