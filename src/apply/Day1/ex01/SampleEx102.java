package apply.Day1.ex01;

public class SampleEx102 {
	public SampleEx102() {
		System.out.println("コンストラクタ");
	}
	public void foo() {
		System.out.println("インスタンスメソッド");
	}
	public static void bar() {
		System.out.println("静的メソッド");
	}
	public static void main(String[] args) {
		SampleEx102 i = new SampleEx102();
		i.foo();
		i.bar();
		SampleEx102.bar();
		bar();
		System.gc();
	}

}
