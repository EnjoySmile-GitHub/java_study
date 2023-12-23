package apply.Day3;

public abstract class Bird {
	private String name;
	public Bird(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	abstract void sing();

}
