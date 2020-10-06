package de.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import de.tiere.Schwein;

public class Main {

	public static void main(String[] args) throws Exception{
		
		// 1. Methode
		Class clazz = Schwein.class;
		
		// 2. Methode
		clazz = new Schwein().getClass();
		
		// 3. Methode
		clazz =Class.forName("de.tiere.Schwein");
		
		System.out.println(clazz.getName());
		
		System.out.println("----------------");
		
		Method [] methods =clazz.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("----------------");
		
		methods =clazz.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("----------------");
		Object object = clazz.newInstance();
		
		System.out.println(object);
		
		Method method = clazz.getMethod("fressen");
		method.invoke(object);
		System.out.println(object);
		
		method = clazz.getDeclaredMethod("setGewicht", int.class);
		method.setAccessible(true);
		method.invoke(object, -100);
		System.out.println(object);
		
		
		Constructor<?> ctor = clazz.getConstructor(String.class);
		object = ctor.newInstance("Miss Piggy");
		System.out.println(object);
 		
	}

}
