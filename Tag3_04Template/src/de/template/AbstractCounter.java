package de.template;

public abstract class AbstractCounter implements CharacterHandler {

	protected int counter;

	@Override
	public void init() {
		counter = 0;
	}

	

	@Override
	public void close() {
		System.out.println(counter);
	}
}
