package babysitting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculateNightlyCharge {

	public boolean checkStartTime(LocalTime time) {
		LocalTime startTimeStart = LocalTime.parse("17:00:00");
		LocalTime endtime = LocalTime.parse("04:00:00");
		LocalTime userTime = LocalTime.now();
		
		if(userTime.isAfter(startTimeStart)) {
			return true;
		}else {
			return false;
		}
		
	}
		
	
	//			for(LocalTime startTime = LocalTime.parse("17:00:00");startTime.isAfter(startTimeStart);startTime.plusHours(1)) {
	//				System.out.println(startTime);
					
		//		}

	public boolean checkEndTime(int time) {
		if (time >= 4) {
			return true;
		} else {
			return false;
		}
	}
}
