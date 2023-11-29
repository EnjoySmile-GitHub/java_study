package day6;

public class Sample601 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		SampleClass instance = new SampleClass(); // インスタンスの生成
		instance.n = 100;
		instance.s = "Hello";
		int ans = instance.add(1, 2);
		String str = instance.add("World");
		System.out.println(ans);
		System.out.println(str);
		instance.showNum();
	}
}
