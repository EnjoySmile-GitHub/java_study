package day6;

public class Minmax {
	public int max(int n1, int n2, int n3) {
		int max;
		
		if (n2 < n1) {
			max = n1;
		} else {
			max = n2;
		}

		if (max < n3) {
			max = n3;
		}

		return max;
	}
	
	public int min(int n1, int n2, int n3) {
		int min;
		
		if(n1 < n2) {
			min = n1;
		} else {
			min = n2;
		}
		
		if(n3 < min) {
			min = n3;
		}
		
		return min;
	}

}
