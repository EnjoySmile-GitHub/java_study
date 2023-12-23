package apply.day6.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

public class Problem1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("cat", "猫");
		map.put("dog", "犬");
		map.put("bird", "鳥");
		map.put("tiger", "トラ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("英語で動物の名前を入力してください：");
        String buf = br.readLine();
        if(Objects.isNull(map.get(buf))) {
        	System.out.println("対応するデータは登録されていません。");
        } else {
        	System.out.println(map.get(buf));	
        }
        
	}

}
