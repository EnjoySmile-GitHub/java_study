package apply.Day4;

public class SampleEx401 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cellphone cp = new Cellphone("test@mail.com", "999-999-999");
		cp.call("888-888-888");
		cp.sendMail("test1@mail.com");
		
		IPhone phone = (IPhone)cp;
		phone.call("777-777-777");
		
		IEmail mail = (IEmail)cp;
		mail.sendMail("test2@mail.com");
	}

}
