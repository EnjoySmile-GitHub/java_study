package apply.Day1.practice;

import java.util.Random;

public class Problemex1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		int height = rnd.nextInt(10) + 1;
		int width = rnd.nextInt(10) + 1;
		System.out.println("たて：" + height);
		System.out.println("よこ：" + width);
		square(height, width);
	}
	static void square(int height, int width) {
		if(height == 0 && width == 0) {
			return;
		}
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}

}
