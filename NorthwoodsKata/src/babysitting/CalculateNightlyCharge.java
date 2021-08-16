package babysitting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculateNightlyCharge {

	public boolean checkStartTime(LocalTime time) {
		LocalTime startTimeStart = LocalTime.parse("17:00");
		LocalTime endtime = LocalTime.parse("04:00");
		LocalTime userTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(time.format(formatter));
		if(userTime.isAfter(startTimeStart)) {
			
			return true;
		}else {
			return false;
		}
		
	}
		
	

	public boolean checkEndTime(LocalTime time) {
		LocalTime startTimeStart = LocalTime.parse("17:00");
		LocalTime endtime = LocalTime.parse("04:00");
		LocalTime userTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(time.format(formatter));
		if(userTime.isBefore(endtime) && userTime.isAfter(startTimeStart)) {
			
			return true;
		}else {
			return false;
		}
	}
}
