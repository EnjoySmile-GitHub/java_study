package day4;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*prob4-1.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(10) + 1;
		System.out.println(rndNum);
		for(int i = 0; i < rndNum; i++) {
			System.out.print("□" + " ");
		}
		System.out.println();
		*/
		
		/*prob4-2.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(10) + 1;
		System.out.println(rndNum);
		int count = 0;
		while(count < rndNum) {
			System.out.print("□ ");
			count++;
		}
		System.out.println();
		*/
		
		/*prob4-3.(難易度：★)
		Random rnd = new Random();
		int rndNum = rnd.nextInt(10) + 1;
		System.out.println(rndNum);
		int count = 0;
		do {
			System.out.print("□ ");
			count++;
		}while(count < rndNum);
		System.out.println();
		*/
		
		/*prob4-4(難易度：★)
		int a = 0;
		while(a < 4) {
			System.out.println("a = " + a);
			a++;
		}
		*/
		
		/*prob4-5(難易度：★)
		int a = 0;
		for(int i = 0; i < 4; i++) {
			System.out.println("a = " + a);
			a++;
		}
		*/
		
		/*prob4-6(難易度：★)
		int a = 3;
		while(0 <= a) {
			System.out.println("a = " + a);
			a--;
		}
		*/
		
		/*prob4-7(難易度：★)
		int a = 3;
		for(int i = 3; 0 <= i; i--) {
			System.out.println("a = " + a);
			a--;
		}
		*/
		
		/*prob4-8.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		while(true) {
			int rndNum = rnd.nextInt(10) + 1;
			System.out.println(rndNum);
			if(rndNum == 10) {
				break;
			}
		}
		System.out.println("終了します");
		*/
		
		/*prob4-9.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		while(true) {
			int rndNum = rnd.nextInt(100) + 1;
			System.out.println(rndNum);
			if(rndNum % 10 == 0) {
				break;
			}
		}
		System.out.println("終了します");
		*/
		
		/*prob4-10.(難易度：★)
		java.util.Random rnd = new java.util.Random();
		for(int i = 0; i < 5; i++) {
			System.out.println(rnd.nextInt(100) + 1);
		}
		*/
		
		/*prob4-11.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int max = 0;
		for(int i = 0; i < 5; i++) {
			int rndNum = rnd.nextInt(100) + 1;
			System.out.println(rndNum);
			if(max < rndNum) {
				max = rndNum;
			}
		}
		System.out.println("最大値：" + max);
		*/
		
		/*prob4-12.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int min = 100;
		for(int i = 0; i < 5; i++) {
			int rndNum = rnd.nextInt(100) + 1;
			System.out.println(rndNum);
			if(rndNum < min) {
				min = rndNum;
			}
		}
		System.out.println("最小値：" + min);
		*/
		
		/*prob4-13.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int rndNum = rnd.nextInt(10) + 1;
		if(5 <= rndNum) {
			for(int i = 0; i < rndNum; i++) {
				System.out.print("★ ");
			}
			System.out.println();
		}else {
			System.out.println("発生した数値：" + rndNum);
		}
		*/
		
		/*prob4-14.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int rndNum = rnd.nextInt(10) + 1;
		System.out.println(rndNum);
		for(int i = 0; i < rndNum; i++) {
			if(rndNum % 2 == 0) {
				System.out.print("★ ");
			}else {
				System.out.print("☆ ");
			}
		}
		System.out.println();
		*/
		
		/*prob4-15.(難易度：★★)
		int count = 1;
		while(count <= 100) {
			System.out.print(count + " ");
			if(count % 10 == 0) {
				System.out.println();
			}
			count++;
		}
		*/
		
		/*prob4-16.(難易度：★)
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
			}
			System.out.println();
		}
		*/
		
		/*prob4-17.(難易度：★★)
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j <= i) {
					System.out.print("■");
				}else {
					System.out.print("□");
				}
			}
			System.out.println();
		}
		*/
		
		/*prob4-18.(難易度：★★)
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i == j) {
					System.out.print("□");
				}else {
					System.out.print("■");
				}
			}
			System.out.println();
		}
		*/
	}
}
