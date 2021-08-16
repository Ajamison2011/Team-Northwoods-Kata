package babysitting;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateNightlyChargeTest {
	
	@Test
	public void shouldStartNoEarlierThan5Pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkTime();
		assertTrue(result);
	}
	
	@Test 
	public void shouldCheckIfTimeIsLaterThan5pm() {
		CalculateNightlyCharge calculate = new CalculateNightlyCharge();
		boolean result = calculate.checkTime();
		assertFalse(result);
	}

}
