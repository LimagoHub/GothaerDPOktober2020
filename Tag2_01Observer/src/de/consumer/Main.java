package de.consumer;

import de.tiere.PigTooFatListener;
import de.tiere.Schwein;

public class Main {

	private Metzger metzger = new Metzger();
	private Spediteur spediteur = new Spediteur();
	private Bauer bauer = new Bauer();
	public static void main(String[] args) {
		new Main().run();

	}

	private void run() {

		Schwein piggy = new Schwein("Miss Piggy");
		piggy.addPigTooFatListener(metzger::schlachten);
		piggy.addPigTooFatListener(new PigTooFatListener() {
			
			@Override
			public void pigTooFat(Schwein sender) {
				spediteur.fahren(sender);
				
			}
		});
		piggy.addPigTooFatListener(s->bauer.kassiertKnete());
		for (int i = 0; i < 10; i++) {
			piggy.fressen();

		}

	}

//	class SchweineMetzgerAdapter implements PigTooFatListener {
//
//		@Override
//		public void pigTooFat(Schwein sender) {
//			metzger.schlachten(sender);
//
//		}
//
//	}

}

class Bauer {
	public void kassiertKnete() {
		System.out.println("Wir machen Party");
	}
}
class Spediteur {
	public void fahren(Object ware) {
		System.out.println("Wir fahren auf der Autobahn");
	}
}

class Metzger {

	public void schlachten(Object tier) {
		System.out.println("Messer wetz");
	}

}
