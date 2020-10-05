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
		throw new UnsupportedOperationException("Häh?");
		
	}

	@Override
	public void changeToA() {
		throw new UnsupportedOperationException("Häh?");
		
	}

	@Override
	public void changeToB() {
		throw new UnsupportedOperationException("Häh?");
		
	}
	
	

}
