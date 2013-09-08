package ch4;

public class Voice implements Singer {
	String singerName;

	public void setSingerName(String singerName){
		this.singerName = singerName;
	}
	
	@Override
	public void play() {
		System.out.println(singerName + " is singing");
	}

}
