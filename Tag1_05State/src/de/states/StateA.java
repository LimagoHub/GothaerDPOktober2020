package de.states;

public class StateA extends AbstractState {

	public StateA(Blende blende) {
		super(blende);
		
	}
	
	@Override
	public void drucken() {
		System.out.println("Hier druckt A");
	}
	
	@Override
	public void changeToB() {
		getBlende().current = getBlende().stateB;
	}

}
