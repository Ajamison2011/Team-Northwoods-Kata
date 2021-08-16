package babysitting;

public class CalculateNightlyCharge {

	public boolean checkStartTime(int time) {
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
