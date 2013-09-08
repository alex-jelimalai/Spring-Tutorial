package ch4.mind;

public class Magician implements MindReader {

	protected String thoughts;

	@Override
	public String getThoughts() {
		return thoughts;
	}

	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting the volunteer's thoughts");
		this.thoughts = thoughts;
	}

}
