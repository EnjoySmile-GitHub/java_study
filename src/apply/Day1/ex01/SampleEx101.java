package apply.Day1.ex01;

public class SampleEx101 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleClassEx01 s1, s2;
		System.out.println("インスタンスの数：" + SampleClassEx01.getNumberofInstance());
		s1 = new SampleClassEx01(50);
		s2 = new SampleClassEx01();
		System.out.println(s1.getValue());
		System.out.println(s2.getValue());
		System.out.println("インスタンスの数：" + SampleClassEx01.getNumberofInstance());
	}

}
