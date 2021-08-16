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
	public void shouldCalculatePayFromStartTimeOf5PmToBedTimeOf9Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateStartTimeAndBedTime(9,5,12);
		assertEquals(48,result);
	}
	@Test
	public void shouldCalculatePayFromStartTimeOf5PmToBedTimeOf8Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateStartTimeAndBedTime(8,5,12);
		assertEquals(36,result);
	}
	
	@Test
	public void shouldCalculatePayFromStartTimeOf6PmToBedTimeOf9Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateStartTimeAndBedTime(9,6,12);
		assertEquals(36,result);
	}
	
	@Test
	public void shouldCalculatePayFromStartTimeOf7PmToBedTimeOf9Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateStartTimeAndBedTime(9,7,12);
		assertEquals(24,result);
	}
	@Test
	public void shouldCalculatePayFromStartTimeOf8PmToBedTimeOf9Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateStartTimeAndBedTime(9,8,12);
		assertEquals(12,result);
	}
	
	@Test
	public void shouldCalculatePayFromStartTimeOf5PmFromBedTimeOf9PmToMidnight() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateBedTimeToMidnight(9,8);
		assertEquals(24,result);
	}
	@Test
	public void shouldCalculatePayFromStartTimeOf5PmFromBedTimeOf8PmToMidnight() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateBedTimeToMidnight(8,8);
		assertEquals(32,result) ;
	}
	
	@Test
	public void shouldCalculatePayFromMidnightToEndOfJobAt4Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateMidnightToEndOfJobAt4Am(16);
		assertEquals(64,result);
	}
	
	@Test
	public void shouldCalculatePayFromStartTimeOf5PmAndBedTimeOf8PmFromMidnightToEndOfJobAt2Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		int result = calculate.calculateMidnightToEndOfJobAt2Am(16);
		assertEquals(32,result);
	}
	
}
