package de.states;

public abstract class AbstractState implements State{
	
	private final Blende blende;

	public AbstractState(Blende blende) {
		this.blende = blende;
	}

	public Blende getBlende() {
		return blende;
	}

	@Override
	public void drucken() {
		throw new UnsupportedOperationException("H�h?");
		
	}

	@Override
	public void changeToA() {
		throw new UnsupportedOperationException("H�h?");
		
	}

	@Override
	public void changeToB() {
		throw new UnsupportedOperationException("H�h?");
		
	}
	
	

}
