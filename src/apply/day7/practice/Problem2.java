package apply.day7.practice;

public class Problem2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				try {
					System.out.println(i / j);
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}

	}

}
