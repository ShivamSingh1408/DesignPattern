package com.aurionpro.model;

public class StrategyOperation implements IOperation {

	IOperation operation;

	public StrategyOperation(IOperation operation) {
		super();
		this.operation = operation;
	}

	@Override
	public int doOpration(int num1, int num2) {
		return operation.doOpration(num1, num2);
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}

}
