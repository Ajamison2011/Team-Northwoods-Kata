package babysitting;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateNightlyChargeTest {
	
	@Test
	public void shouldStartNoEarlierThan5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkTime(5);
		assertTrue(result);
	}
	
	@Test 
	public void shouldCheckIfTimeIsBefore5pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkTime(5);
		assertFalse(result);
	}

}
