package de.services;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class BeanCreator {
	
	private static final String PROMPT = "Bitte Wert für %s eingeben: ";
	private static final String PREFIX = "set";
	
	public Object createAndFillBean(final String fullQualifiedClassName) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			return tryCreateAndFillBean(fullQualifiedClassName, scanner);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Object tryCreateAndFillBean(final String fullQualifiedClassName, final Scanner scanner)throws Exception {
		final Object result = Class.forName(fullQualifiedClassName).newInstance();
		
		Arrays
			.stream(result.getClass().getDeclaredMethods())
			.filter(m->m.getName().startsWith(PREFIX))
			.forEach(m->fillPropertyWithUserInput(scanner, result, m));
		
//		for(Method method : result.getClass().getDeclaredMethods()) {
//			scanForProperties(scanner, result, method);
//		}
		
		return result;
	}

//	private void scanForProperties(Scanner scanner, final Object result, Method method) throws IllegalAccessException, InvocationTargetException {
//		if(method.getName().startsWith(PREFIX)) {
//			fillPropertyWithUserInput(scanner, result, method);
//		}
//	}

	private void fillPropertyWithUserInput(final Scanner scanner, final Object result, final Method method)  {
		try {
			System.out.print(String.format(PROMPT, method.getName().substring(PREFIX.length())));
			method.invoke(result, scanner.nextLine());
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}

}
