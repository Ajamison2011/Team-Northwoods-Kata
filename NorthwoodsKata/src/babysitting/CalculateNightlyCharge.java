package babysitting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculateNightlyCharge {

	public boolean checkStartTime(int time) {
		// Assuming you arrive at 5 on the dot
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
		// without knowing the bed time I'm going to assume it is 9
		return (bedTime - startTime) * rate;
	}

	public int calculateBedTimeToMidnight(int bedtime, int rate) {
		return (12 - bedtime) * rate;
	}

	public int calculateMidnightToEndOfJob(int rate) {

		// Assuming the job last until 4am
		int total = 0;
		
		for(int i=0;i<=4;i++) {
			total = i;
		}
		return total * rate;
		
	}

}
