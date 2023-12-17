package apply.Day4.practice;

public class Problemex4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cellphone cp = new Cellphone();
        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
	}
	public static void funcPhone(IPhone phone) {
		phone.callPhone();
		phone.recievePhone();
	}
	public static void funcMailer(IMailer mailer) {
		mailer.sendMail();
		mailer.recieveMail();
	}
	public static void funcComputer(IComputer computer) {
		computer.playGame();
		computer.borwseWeb();
	}

}
