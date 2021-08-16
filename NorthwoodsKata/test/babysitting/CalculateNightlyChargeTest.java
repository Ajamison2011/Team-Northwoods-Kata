package babysitting;
import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

public class CalculateNightlyChargeTest {
	
	@Test
	public void shouldCheckIsTimeIsAfter5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkStartTime(LocalTime.now());
		assertTrue("Time to Start should be After 5PM", result);
	}
	
	@Test 
	public void shouldCheckIfTimeIsBefore5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkStartTime(LocalTime.now());
		assertFalse(result);
	}
	
	@Test
	public void shouldCheckIfEndTimeIsLessThan4Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkEndTime(LocalTime.now());
		assertTrue(result);
	}
	
	@Test
	public void shouldCheckIfEndTimeIsGreaterThan4Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkEndTime(LocalTime.now());
		assertFalse(result);
	}
	
	@Test
	public void shouldCalculatePayFromStartTimeToBedTime() {
		fail();
		
	}

}
