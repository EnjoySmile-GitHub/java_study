package apply.Day5.practice;

import java.util.ArrayList;
import java.util.Random;

public class Problem3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			System.out.print("0～10の値を出力：");
			int rndNum = rnd.nextInt(101);
			System.out.println(rndNum);
			if(rndNum == 0) {
				break;
			}
			list.add(rndNum);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print("一の位が" + i + "：");
			Boolean isChk = false;
			/*list.forEach(data -> {
				if(data % 10 == src) {
					isChk = true;
					System.out.print(data + " ");
				}
			});
			*/
			for(int num : list) {
				if(num % 10 == i) {
					isChk = true;
					System.out.print(num + " ");
				}
			}
			if(!isChk) {
				System.out.print("なし");
			}
			System.out.println();
		}
	}

}
