package apply.Day1.practice;

public class Problemex1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int b = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int c = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int result = mul(a,b, c);  //  二つの数の積を求める
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(a + " * " + b + " * " + c + " = " + result);

	}
	static int mul(int a, int b, int c) {
		return a * b * c;
	}

}
