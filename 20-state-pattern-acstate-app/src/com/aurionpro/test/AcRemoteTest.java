package com.aurionpro.test;

import com.aurionpro.model.AcContext;
import com.aurionpro.model.AcStartState;
import com.aurionpro.model.AcStopState;
import com.aurionpro.model.IState;

public class AcRemoteTest {

	public static void main(String[] args) {
		AcContext acContext = new AcContext();
		IState acStart = new AcStartState();
		acContext.setState(acStart);
		acContext.doAction();
		
		System.out.println("--------------------------------");
		
		IState acStop = new AcStopState();
		acContext.setState(acStop);
		acContext.doAction();

	}

}
