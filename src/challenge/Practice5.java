package challenge;

public class Practice5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// prob8-5.(難易度★★)（いまさら世界のナベアツ計算）
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
				continue;
			}
			if(Integer.toString(i).indexOf("3") != -1) {
				System.out.println(i);
				continue;
			}
		}

	}

}
