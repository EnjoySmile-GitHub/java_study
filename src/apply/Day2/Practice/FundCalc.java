package apply.Day2.Practice;

public class FundCalc {
	protected double number1 = 0.0;
	protected double number2 = 0.0;
	
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	public double getNumber1() {
		return this.number1;
	}
	public double getNumber2() {
		return this.number2;
	}
	public double add() {
		return this.number1 + this.number2;
	}
	public double sub() {
		return this.number1 - this.number2;
	}

}
