package cl222zy;

/** Simulates an alarmclock.
 * 
 * @author christian
 *
 */

public class Step2_Lab03 {

	public static void main(String[] args) {
		AlarmClock alarmclock = new AlarmClock(23,48);
		alarmclock.display();
		alarmclock.setAlarmTime(6, 15);
		for (int i = 1 ; i <= 500 ; i++) {
			alarmclock.timeTick();
		}
		alarmclock.display();
	}

}

class AlarmClock {
	
	private int hours;
	private int minutes;
	private int alarmHours;
	private int alarmMinutes;
	private boolean alarmOn;
	
	public AlarmClock() {
		hours = 0;
		minutes = 0;
		alarmHours = 0;
		alarmMinutes = 0;
		alarmOn = false;
	}
	
	public AlarmClock(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
		alarmHours = 0;
		alarmMinutes = 0;
		alarmOn = false;
	}
	
	public void setAlarmTime(int hours, int minutes) {
		alarmHours = hours;
		alarmMinutes = minutes;
		alarmOn = true;
	}
	
	public void setAlarmTime(boolean alarmOn) {
		this.alarmOn = alarmOn;
	}

	public void display() {
		if (minutes < 10) {
			System.out.printf("%d:0%d%n", hours, minutes);
			} else {
				System.out.printf("%d:%d%n", hours, minutes);
			}
		}
	
	public void timeTick() {
		++minutes;
		if (minutes == 60) {
			minutes = 0;
			++hours;
			if (hours == 24) {
				hours = 0;
			}
		}
		checkAlarm();
	}
	
	private void checkAlarm() {
		if (alarmOn && hours == alarmHours && minutes == alarmMinutes) {
			String time;
			if (minutes < 10) {
				time = String.format("%d:0%d", hours, minutes);
			} else {
				time = String.format("%d:%d", hours, minutes);
			}
			System.out.println(time + " - VAKNA, det är dags att gå upp!");
		}
	}

}
