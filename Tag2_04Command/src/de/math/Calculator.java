package de.math;

public class Calculator {
	
	private static final Calculator INSTANCE = new Calculator();
	
		
	public static Calculator getInstance() {
		return INSTANCE;
	}

	private Calculator() {
		
	}
	
	private double memory = 0;

	
	
	public void add(double value) {
		memory += value;
	}

	public void sub(double value) {
		memory -= value;
	}

	public void pow(double value) {
		memory *= value;
	}

	public void div(double value) {
		memory /= value;
	}
	
	public void clear() {
		memory = 0;
	}

	public void print() {
		System.out.println(memory);
	}

}
