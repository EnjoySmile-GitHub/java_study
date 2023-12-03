package apply.Day1.practice;

public class Problemex1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + sub(a, b));

	}
	static int add(int a, int b) {
		return a + b;
	}
	static int sub(int a, int b) {
		return a - b;
	}

}
