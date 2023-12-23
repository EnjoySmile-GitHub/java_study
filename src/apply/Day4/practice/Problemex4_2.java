package apply.Day4.practice;

public class Problemex4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AlarmClock as = new AlarmClock();
		funcAlarm(as);
		funcClock(as);
	}
	public static void funcAlarm(IAlarm alarm) {
		alarm.setAlarm();
		alarm.alarm();
		alarm.stopAlarm();
	}
	public static void funcClock(IClock clock) {
		clock.adjustTime();
		clock.showTime();
	}

}
