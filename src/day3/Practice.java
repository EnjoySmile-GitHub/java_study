package day3;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*prob3-1.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(10) + 1;
		System.out.println(rndNum);
		if (rndNum >= 5) {
			System.out.println("5以上です。");
		}
		*/
		
		/*prob3-2.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(10) + 1;
		System.out.println(rndNum);
		if (rndNum != 1) {
			System.out.println("1ではありません");
		}
		*/
		
		/*prob3-3.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(100) + 1;
		System.out.println(rndNum);
		if(rndNum < 50) {
			System.out.println("50未満です");
		}
		*/
		
		/*prob3-4.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(100) + 1;
		System.out.println(rndNum);
		if(rndNum <= 10 || 90 <= rndNum) {
			System.out.println("10以下か90以上の値です");
		}
		*/
		
		/*prob3-5.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(100) + 1;
		System.out.println(rndNum);
		if(20 <= rndNum && rndNum < 80) {
			System.out.println("20以上80未満です");
		}
		*/
		
		/*prob3-6.(難易度：★)
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("数値 : " + num);
		if(3 <= num) {
			System.out.println("3以上です。");
		}
		*/
		
		/*prob3-7.(難易度：★)
		int rndNum = (int) (Math.random() * 10) + 1;
		System.out.println(rndNum);
		if(5 <= rndNum) {
			System.out.println("5以上です");
		}else {
			System.out.println("5未満です");
		}
		*/
		
		/*prob3-8.(難易度：★)
		int rndNum = (int) (Math.random() * 10) + 1;
		System.out.println(rndNum);
		if(rndNum == 1) {
			System.out.println("1です。");	
		}else {
			System.out.println("1ではありません。");
		}
		*/
		
		/*prob3-9.(難易度：★)
		int rndNum = (int) (Math.random() * 100) + 1;
		System.out.println(rndNum);
		if(rndNum < 50) {
			System.out.println("50未満です");	
		}else {
			System.out.println("50以上です");
		}
		*/
		
		/*prob3-10.(難易度：★)
		int rndNum = (int) (Math.random() * 100) + 1;
		System.out.println(rndNum);
		if(rndNum <= 10 || 90 <= rndNum) {
			System.out.println("10以下か90以上の値です");
		}else {
			System.out.println("10より大きく90未満です");
		}
		*/
		
		/*prob3-11.(難易度：★)
		int rndNum = (int) (Math.random() * 100) + 1;
		System.out.println(rndNum);
		if(20 <= rndNum && rndNum < 80) {
			System.out.println("20以上80未満です");
		}else {
			System.out.println("20未満か、80以上です");
		}
		*/
		
		/*prob3-12.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(21) - 10;
		System.out.println(rndNum);
		if(0 < rndNum) {
			System.out.println("正の値です");
		}else if(rndNum < 0) {
			System.out.println("負の値です");
		}else {
			System.out.println("0です");
		}
		*/
		
		/*prob3-13.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(3) + 1;
		System.out.println(rndNum);
		switch(rndNum) {
		case 1:
			System.out.println("グー");
			break;
		case 2:
			System.out.println("パー");
			break;
		case 3:
			System.out.println("チョキ");
			break;
		default:
			System.out.println("Error");
			break;
		}
		*/
		
		/*prob3-14.(難易度：★)
		Random rnd = new Random();
		int a = rnd.nextInt(10) + 1;
		int b = rnd.nextInt(10) + 1;
		System.out.println(a);
		System.out.println(b);
		if(b < a) {
			System.out.println("aのほうが大きいです。");
		}else if(a < b) {
			System.out.println("bのほうが大きいです。");
		}else {
			System.out.println("等しいです。");
		}
		*/
		
		/*prob3-15.(難易度：★★)
		Random rnd = new Random();
		int score = rnd.nextInt(100) + 1;
		System.out.println(score);
		if(80 <= score) {
			System.out.println("優");
		}else if(70 <= score) {
			System.out.println("良");
		}else if(60 <= score) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		*/
		
		/*prob3-16.(難易度：★★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(100) + 1;
		System.out.println(rndNum);
		if((rndNum % 2 == 0) && (rndNum % 3 == 0)) {
			System.out.println("2と3の公倍数です。");
		}else if(rndNum % 2 == 0) {
			System.out.println("2の倍数です。");
		}else if(rndNum % 3 == 0) {
			System.out.println("3の倍数です。");
		}
		*/
		
		/*prob3-17.(難易度：★★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(100) + 1;
		System.out.println(rndNum);
		if((rndNum <= 50) && (rndNum % 2 == 0)) {
			System.out.println("50以下の偶数です。");
		}else if(rndNum <= 50) {
			System.out.println("50以下です。");
		}else if(rndNum % 2 == 0) {
			System.out.println("偶数です。");
		}
		*/
		
		/*prob3-18.(難易度：★★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(46) - 10;
		System.out.println(rndNum);
		if(30 <= rndNum) {
			System.out.println("真夏日です。");
		}else if(25 <= rndNum) {
			System.out.println("夏日です。");
		}else if(rndNum < 0) {
			System.out.println("真冬日です。");
		}
		*/
	}
}
