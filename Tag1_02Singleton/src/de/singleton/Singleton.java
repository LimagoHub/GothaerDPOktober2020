package de.singleton;

import java.lang.ref.SoftReference;

public class Singleton {
	
	private static SoftReference<Singleton> softReference = new SoftReference<Singleton>(new Singleton());
	
	
	
	
	public synchronized static Singleton getInstance() {

		if(softReference.get() == null)
			softReference = new SoftReference<Singleton>(new Singleton());
		return softReference.get();
	}




	private Singleton() {
		
	}
	
	public void log(String message) {
		System.out.println(message);
	}

}
