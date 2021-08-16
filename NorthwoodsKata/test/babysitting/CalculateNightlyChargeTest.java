package babysitting;
import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

public class CalculateNightlyChargeTest {
	
	@Test
	public void shouldCheckIsTimeIsAfter5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkStartTime(5);
		assertTrue(result);
	}
	
	@Test 
	public void shouldCheckIfTimeIsBefore5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkStartTime(4);
		assertFalse(result);
	}
	
	@Test
	public void shouldCheckIfEndTimeIsLessThan4Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkEndTime(3);
		assertTrue(result);
	}
	
	@Test
	public void shouldCheckIfEndTimeIsGreaterThan4Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkEndTime(4);
		assertTrue(result);
	}
	
	@Test
	public void shouldCalculatePayFromStartTimeToBedTime() {
		
		
	}

}
