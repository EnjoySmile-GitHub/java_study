package apply.day7;

public class SampleEx701 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			for(int i = 3; i >= 0; i--) {
				int a = i;
				int b = 5;
				System.out.print(b + "/" + a + "=");
				System.out.println(b / a);
			}
		} catch(Exception ex) {
			System.out.println();
			System.out.println("例外発生");
		} finally {
			System.out.println("終了");
		}

	}

}
