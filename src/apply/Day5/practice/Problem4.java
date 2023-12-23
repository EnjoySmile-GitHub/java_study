package apply.Day5.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> list = new ArrayList<String>();
        while(true) {
        	System.out.print("文字列を入力：");
        	String buf = br.readLine();
        	if(buf.length() == 0) {
        		break;
        	}
        	list.add(buf);
        }
        
        for(String data : list) {
        	System.out.print(data + " ");
        }
        System.out.println();
	}

}
