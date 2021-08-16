package babysitting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculateNightlyCharge {

	public boolean checkStartTime(int time) {
		
	LocalTime localTime = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	System.out.println(localTime.format(formatter));
	
		if (time >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkEndTime(int time) {
		if (time >= 4) {
			return true;
		} else {
			return false;
		}
	}
}
