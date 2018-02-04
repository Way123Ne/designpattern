package com.wayne.oper;

import com.wayne.inter.IFactory;
import com.wayne.operation.Operation;
import com.wayne.operclass.OperationAdd;

/**
 *具体工厂角色:加法类工厂 
 * @author Wayne
 *
 */

public class AddFactory implements IFactory {

	public Operation CreateOperation() {
		
		return new OperationAdd();
	}

	
}
