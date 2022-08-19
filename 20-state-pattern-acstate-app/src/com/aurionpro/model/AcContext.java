package com.aurionpro.model;

public class AcContext implements IState {

	private IState state;
	
	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}

	@Override
	public void doAction() {
		state.doAction();
	}

}
