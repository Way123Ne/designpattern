package com.wayne.operation;

public abstract class Operation {

	private double numberA = 0;
	private double numberB = 0;
	
	public void setNumberA(double numberA){
		this.numberA = numberA;
	}
	public double getNumberA(){
		return numberA;
	}
	public void setNumberB(double numberB){
		this.numberB = numberB;
	}
	public double getNumberB(){
		return numberB;
	}
	public double getResult(){
		double result = 0;
		return result;
	}
}
