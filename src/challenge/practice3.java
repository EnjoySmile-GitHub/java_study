package challenge;

public class practice3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// prob8-3.(難易度★★)（階乗を求める計算）
		//java.util.Random rnd = new java.util.Random();
		//int rndNum = rnd.nextInt(10) + 1;
		int rndNum = 6;
		int total = 1;
		for(int i = rndNum; i > 0; i--) {
			total *= i;
		}
		System.out.println(total);
	}

}
