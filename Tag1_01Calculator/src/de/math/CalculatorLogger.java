package de.math;

public class CalculatorLogger implements Calculator{
	
	public final Calculator calculator;

	public CalculatorLogger(final Calculator calculator) {
		this.calculator = calculator;
	}

	public double add(double a, double b) {
		System.out.println("Add Wurde gerufen");
		return calculator.add(a, b);
	}

	public double sub(double a, double b) {
		return calculator.sub(a, b);
	}
	
	

}
