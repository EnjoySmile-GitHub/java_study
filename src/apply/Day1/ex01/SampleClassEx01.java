package apply.Day1.ex01;

public class SampleClassEx01 {
	private int value = 0;
	private static int num = 0;

	public SampleClassEx01(int value) {
		this.value = value;
		num++;
	}

	public SampleClassEx01() {
		this(100);
	}
	
	public static int getNumberofInstance() {
		return num;
	}
	public int getValue() {
		return this.value;
	}
}
