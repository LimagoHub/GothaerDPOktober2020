package de.states;

public class StateB extends AbstractState {

	public StateB(Blende blende) {
		super(blende);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drucken() {
		System.out.println("Hier druckt B");
	}
	
	@Override
	public void changeToA() {
		getBlende().current =getBlende().stateA;
	}
}
