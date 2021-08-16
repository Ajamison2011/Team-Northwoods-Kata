package babysitting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculateNightlyCharge {

	public boolean checkStartTime(int time) {
//Assuming you arrive at 5 on the dot
		if (time >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkEndTime(int time) {
// assuming you stay until 4am
		if (time <= 4) {
			return true;
		} else {
			return false;
		}
	}

	public int calculateStartTimeAndBedTime(int bedTime, int startTime, int rate) {
//without knowing the bed time I'm going to assume it is 9
		return (bedTime - startTime) * rate;
	}

}
