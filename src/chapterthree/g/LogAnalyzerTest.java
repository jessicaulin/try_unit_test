package chapterthree.g;

import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void overrideTestWithoutStub() {
		TestableLogAnalyzer logan = new TestableLogAnalyzer();
		logan.isSupported = true;
		
		boolean result = logan.isValidLogFileName("file.ext");
		
		Assert.assertTrue(result);
	}

	private class TestableLogAnalyzer extends LogAnalyzerUsingFactoryMethod {
		public boolean isSupported = true;
		
		@Override
		public boolean isValidLogFileName(String fileName) {
			return this.isValid(fileName);
		}

		private boolean isValid(String fileName) {
			return isSupported;
		}
	}
}