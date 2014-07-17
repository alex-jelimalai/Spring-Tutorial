package in_action.ch4.mind;

public class Volunteer implements Thinker {

	private String thoughts;

	@Override
	public void thinkOfSomething(String thought) {
		this.thoughts = thought;
	}

	public String getThoughts() {
		return thoughts;
	}

}
