package ch2.jugger;

import ch2.Performer;


public class Juggler implements Performer {
	private int beanBags = 3;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}

}
