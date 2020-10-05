package de.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorImpl implements Calculator {
	
	@Override
	public double add(double a, double b) {
		
		try {
						
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}

}
