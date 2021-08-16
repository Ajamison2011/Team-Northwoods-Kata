package babysitting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculateNightlyCharge {

	public boolean checkStartTime(int time) {
		
		LocalTime startTimeStart = LocalTime.parse("17:00:00");
		LocalTime endtime = LocalTime.parse("04:00:00");
	
				for(LocalTime startTime = LocalTime.parse("17:00:00");startTime.isAfter(startTimeStart);startTime.plusHours(1)) {
					System.out.println(startTime);
					
				}
				
	
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
