package apply.Day5.practice;
import java.util.ArrayList;
import java.util.Random;

public class Problem6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			System.out.print("0～10の値を出力：");
			int num = rnd.nextInt(11);
			System.out.println(num);
			if(num == 0) {
				break;
			}
			list.add(num);
		}
		ArrayList<Integer> delIdx = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 2) {
				delIdx.add(i);
			}
		}
		int delCount = 0;
		for(int idx : delIdx) {
			list.remove(idx - delCount);
			delCount++;
		}
		for(int data :  list) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
