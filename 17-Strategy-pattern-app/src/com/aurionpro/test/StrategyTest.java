package com.aurionpro.test;

import com.aurionpro.model.AddOperation;
import com.aurionpro.model.MultiplyOperation;
import com.aurionpro.model.StrategyOperation;

public class StrategyTest {

	public static void main(String[] args) {
		StrategyOperation op = new StrategyOperation(new AddOperation());
		System.out.println(op.doOpration(20, 10));
		op.setOperation(new MultiplyOperation());
		System.out.println(op.doOpration(20, 10));
	}

}
