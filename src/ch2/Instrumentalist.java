package ch2;

import ch2.instrument.Instrument;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;

	@Override
	public void perform() {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String screamSong() {
		return song;
	}
}
