package com.context.cn;

import com.strategy.inter.Strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
	
}
