package de.flyweight;

import java.time.Duration;
import java.time.Instant;

public class StringDemo {

	public static void main(String[] args) {
		
//		StringBuilder s = new StringBuilder("Hallo");
//		
//		Instant start = Instant.now();
//		for (int i = 0; i < 2_000_000; i++) {
//			s.append("a");
//			
//		}
//		String destination = s.toString();
//		Instant ende = Instant.now();
//		Duration duration = Duration.between(start, ende);
//		System.out.println(duration.toMillis());
		
		
		AttributedCharacter a1 = AttributedCharacter.getInstance('a', true);
		AttributedCharacter a2 = AttributedCharacter.getInstance('a', true);
		AttributedCharacter a3 = AttributedCharacter.getInstance('b', true);
		
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		
	}

}
