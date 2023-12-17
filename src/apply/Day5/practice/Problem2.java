package apply.Day5.practice;

import java.util.ArrayList;
import java.util.Random;

public class Problem2 {

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
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

}
