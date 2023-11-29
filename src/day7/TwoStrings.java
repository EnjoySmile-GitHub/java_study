package day7;

public class TwoStrings {
	private String string1;
	private String string2;
	
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	
	public String getString1() {
		return this.string1;
	}
	public String getString2() {
		return this.string2;
	}
	public String getConnectedString() {
		return this.string1 + this.string2;
	}

}
