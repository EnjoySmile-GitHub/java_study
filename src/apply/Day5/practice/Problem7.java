package apply.Day5.practice;

import java.util.ArrayList;
import java.util.Random;

public class Problem7 {

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
			if(list.size() == 0) {
				list.add(rndNum);
			} else {
				for(int i = 0; i < list.size(); i++) {
					if (list.get(i) > rndNum) {
						list.add(i, rndNum);
						break;
					}
					if(i == list.size() - 1) {
						list.add(rndNum);
						break;
					}
				}
			}
			System.out.print("出力された数：");
			for(int data : list) {
				System.out.print(data + " ");
			}
			System.out.println();
		}
	}

}
