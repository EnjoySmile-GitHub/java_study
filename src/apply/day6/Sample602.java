package apply.day6;

import java.util.HashSet;

public class Sample602 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("山田");
		hs.add("太田");
		hs.add("山田");
		for(String s : hs) {
			System.out.println(s);
		}
	}
}
