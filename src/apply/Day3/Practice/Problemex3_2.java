package apply.Day3.Practice;

public class Problemex3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer[] cp = new Computer[3];
		cp[0] = new PersonalComputer();
		cp[1] = new TalbetPC();
		cp[2] = new SmartPhone();
		for(Computer c:cp) {
			c.showType();
            c.input();
            c.output();
            c.communication();
            System.out.println("--------------------------------------");
		}
	}

}
