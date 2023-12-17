package apply.Day5.practice;

import java.util.ArrayList;
import java.util.Random;

public class Problem1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			System.out.print("0～10の値を出力：");
			
			int rndNum = rnd.nextInt(11);
			System.out.println(rndNum);
			
			if(rndNum == 0) {
				break;
			}
			
			list.add(rndNum);
		}
		
		System.out.print("偶数：");
		for(int num : list) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("奇数：");
		for(int num : list) {
			if(num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
	}

}
