package day5;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*prob5-1.(難易度：★)
		int[] a = new int[7];
		java.util.Random rnd = new java.util.Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(10) + 1;
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=" + a[i] + " ");
		}
		System.out.println();
		*/
		
		/*prob5-2.(難易度：★)
		double[] d = {0.2, -5.1, 3.2, 1.8};
		for(int i = 0; i < d.length; i++) {
			System.out.print("d[" + i + "]=" + d[i] + " ");
		}
		System.out.println();
		*/
		
		/*prob5-3.(難易度：★★)
		int[] num_array = new int[10];
		java.util.Random rnd = new java.util.Random();
		for(int i = 0; i < num_array.length; i++) {
			num_array[i] = rnd.nextInt(100) + 1;
		}
		for(int i = 0; i < num_array.length; i++) {
			System.out.print(num_array[i] + " ");
		}
		System.out.println();
		System.out.print("奇数：");
		for(int i = 0; i < num_array.length; i++) {
			if(num_array[i] % 2 == 1) {
				System.out.print(num_array[i] + " ");
			}
		}
		System.out.println();
		System.out.print("偶数：");
		for(int i = 0; i < num_array.length; i++) {
			if(num_array[i] % 2 == 0) {
				System.out.print(num_array[i] + " ");
			}
		}
		System.out.println();
		*/
		
		/*prob5-4.(難易度：★★)
		int[] data = new int[10];
		java.util.Random rnd = new java.util.Random(); 
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("50以上の数");
		for(int i = 0; i < data.length; i++) {
			if(50 <= data[i] ){
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数");
		for(int i = 0; i < data.length; i++) {
			if(data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		*/
		
		/*prob5-5.(難易度：★★)
		int[] data = new int[10];
		java.util.Random rnd = new java.util.Random();
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(10) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("3の倍数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 3 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("3の倍数以外の数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 3 != 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		*/
		
		/*prob5-6.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(10) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		int max = 0;
		int min = 10;
		int sum = 0;
		for(int i = 0; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
			if(data[i] < min) {
				min = data[i];
			}
			sum += data[i];
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("平均値：" + (sum / data.length));
		*/
		
		/*prob5-7.(難易度：★★★)
		java.util.Random rnd = new java.util.Random();
		int[] data = new int[5];
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(10) + 1;
		}
		int sum = 0;
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			sum += data[i];
		}
		System.out.println();
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + (sum / data.length));
		System.out.print("平均値より大きい数：");
		for(int i = 0; i < data.length; i++) {
			if((sum / data.length) < data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("平均値より小さい数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] < (sum / data.length)) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		*/
		
		/*prob5-8.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(21) - 10;
		}
		int bigger_count = 0;
		int small_count = 0;
		int zero_count = 0;
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			if(0 < data[i]) {
				bigger_count++;
			}else if(data[i] < 0) {
				small_count++;
			}else {
				zero_count++;
			}
		}
		System.out.println();
		System.out.println("0より大きい数：" + bigger_count);
		System.out.println("0より小さい数：" + small_count);
		System.out.println("0の個数：" + zero_count);
		*/
		
		/*prob5-9.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("50以上の数：");
		for(int i = 0; i < data.length; i++) {
			if(50 <= data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		*/
		
		/*prob5-10.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int[] data = new int[7];
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(10) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*prob5-11.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int[] data = new int[5];
		for(int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		for(int i = 0; i < data.length; i++) {
			if(data[i] < 60) {
				list1.add(data[i]);
			}else if(data[i] < 80) {
				list2.add(data[i]);
			}else {
				list3.add(data[i]);
			}
		}
		list1.forEach(s -> System.out.print(s + " "));
		System.out.println();
		list2.forEach(s -> System.out.print(s + " "));
		System.out.println();
		list3.forEach(s -> System.out.print(s + " "));
		System.out.println();
		*/
		
		/*prob5-12.(難易度：★)
		java.util.Random rnd = new java.util.Random();
		int[][] data = new int[3][3];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				data[i][j] = rnd.nextInt(10);
			}
		}
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		/*prob5-13.(難易度：★★)
		java.util.Random rnd = new java.util.Random();
		int[][] data = new int[3][3];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				data[i][j] = rnd.nextInt(10);
			}
		}
		int max = 0;
		int min = 9;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
				if(max < data[i][j]) {
					max = data[i][j];
				}else if(data[i][j] < min) {
					min = data[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		*/
	}

}
