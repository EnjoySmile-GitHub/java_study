package apply.Day5.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem5 {

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
        ArrayList<Integer> delIdx = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i).length() >= 5) {
        		delIdx.add(i);
        	}
        }
        int delCount = 0;
        for(int idx : delIdx) {
        	list.remove(idx - delCount);
        	delCount++;
        }
        System.out.print("5文字未満の単語：");
        for(String data : list) {
        	System.out.print(data + " ");
        }
        System.out.println();
	}

}
