package de.application;

import java.time.Duration;
import java.time.Instant;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorFactory;

public class Main {

	public static void main(String[] args) {
		
		Instant start = Instant.now();
		//....
		Instant ende = Instant.now();
		Duration duration = Duration.between(start, ende);
		System.out.println("Duration="+duration.toMillis());
		
		Calculator calculator = CalculatorFactory.create();
		CalcClient client = new CalcClient(calculator);
		client.go();

	}

}
