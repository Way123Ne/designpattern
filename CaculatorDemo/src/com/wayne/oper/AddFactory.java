package com.wayne.oper;

import com.wayne.inter.IFactory;
import com.wayne.operation.Operation;
import com.wayne.operclass.OperationAdd;

/**
 *���幤����ɫ:�ӷ��๤�� 
 * @author Wayne
 *
 */

public class AddFactory implements IFactory {

	public Operation CreateOperation() {
		
		return new OperationAdd();
	}

	
}
