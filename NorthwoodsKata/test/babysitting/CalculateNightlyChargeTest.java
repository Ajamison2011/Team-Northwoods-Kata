package babysitting;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateNightlyChargeTest {
	
	@Test
	public void shouldCheckIsTimeIsAfter5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkStartTime("");
		assertTrue(result);
	}
	
	@Test 
	public void shouldCheckIfTimeIsBefore5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkStartTime("");
		assertFalse(result);
	}
	
	@Test
	public void shouldCheckIfEndTimeIsLessThan4Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkEndTime(6);
		assertTrue(result);
	}
	
	@Test
	public void shouldCheckIfEndTimeIsGreaterThan4Am() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkEndTime(3);
		assertFalse(result);
	}
	
	

}
