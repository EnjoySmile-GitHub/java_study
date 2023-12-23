package apply.day6.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("1", "一");
		map.put("2", "二");
		map.put("3","三");
		map.put("4","四");
		map.put("5","五");
		map.put("6","六");
		map.put("7","七");
		map.put("8","八");
		map.put("9","九");
		map.put("0","〇");
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("整数の値を入力してください：");
        String buf = br.readLine();
        
        boolean isNumeric = buf.matches("[+-]?\\d*(\\.\\d+)?");
        if(isNumeric) {
        	int count = 0;
        	for(int i = buf.length() - 1; i >= 0; i--) {
        		if(count > 3) {
        			System.out.print(",");
        			count = 0;
        		}
        		System.out.print(map.get(buf.substring(i, i)));
        	}
        } else {
        	System.out.println("整数の値を入力してください。");
        }
	}

}
