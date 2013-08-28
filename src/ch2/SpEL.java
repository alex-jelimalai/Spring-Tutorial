package ch2;

import ch2.instrument.Instrument;
import ch2.performer.Performer;

/**
 * Class to demonstrate the SpEL
 * 
 * @author Alexandr
 * 
 */
public class SpEL implements Performer {
	private int count;
	private Instrument instrument;
	private double pi;

	@Override
	public void perform() {
		System.out.println("SpEL expresion:");
		System.out.println("Count=" + count);
		instrument.play();
		System.out.println("pi="+pi);
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	
	
}
