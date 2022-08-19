package com.aurionpro.model;

public class SubtractionExpression implements IExpression {
	private String expression;

	public SubtractionExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngine interpreterEngine) {
		return interpreterEngine.subtraction(expression);
	}

}
