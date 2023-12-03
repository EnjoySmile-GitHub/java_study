package challenge;

public class practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// prob8-2.(難易度★★)（ピタゴラス数2）
		for(int a = 1; a <= 100; a++) {
			for(int b = 1; b <= 100; b++) {
				for(int c = 1; c <= 100; c++) {
					if((int)Math.pow(a, 2) + (int)Math.pow(b, 2) == (int)Math.pow(c, 2)) {
						if(a <= b) {
							System.out.println("a=" + a + ", b=" + b + ", c=" + c);							
						}
					}
				}
			}
		}

	}

}
