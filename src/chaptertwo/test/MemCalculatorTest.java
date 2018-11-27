package chaptertwo.test;

import org.junit.Assert;
import org.junit.Test;

import chaptertwo.product.MemCalculator;

public class MemCalculatorTest {

	@Test
	public void sum_ByDefault_ReturnsZero() {
		MemCalculator calc = makeCalc();
		
		int lastSum = calc.sum();
		
		Assert.assertEquals(0, lastSum);
	}
	
	@Test
	public void Add_WhenCalled_ChangesSum() {
		MemCalculator calc = makeCalc();
		
		calc.add(1);
		int sum = calc.sum();
		
		Assert.assertEquals(1, sum);
	}
	
	private static MemCalculator makeCalc() {
		return new MemCalculator();
	}
}
