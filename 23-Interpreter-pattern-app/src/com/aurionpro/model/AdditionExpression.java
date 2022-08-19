package com.aurionpro.model;

public class AdditionExpression implements IExpression {
	private String expression;

	public AdditionExpression(String expression) {
		this.expression = expression;
	}

	public int interpret(InterpreterEngine interpreterEngine) {
		return interpreterEngine.addition(expression);
	}

}
