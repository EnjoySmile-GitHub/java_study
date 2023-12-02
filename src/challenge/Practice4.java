package challenge;

public class Practice4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//prob8-4.(難易度★★)（桁数を求める計算）
		java.util.Random rnd = new java.util.Random();
		int rndNum = rnd.nextInt(1000) + 1;
		System.out.println(rndNum);
		int len = String.valueOf(rndNum).length();
		System.out.println(len);
	}

}
