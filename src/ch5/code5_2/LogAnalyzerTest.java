package ch5.code5_2;

import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void analyze_TooShortFileName_CallLogger() {
		FakeLogger logger = new FakeLogger();
		LogAnalyzer analyzer = new LogAnalyzer(logger);
		analyzer.minNameLength = 6;
		analyzer.analyze("a.txt");
		Assert.assertTrue(logger.lastError.contains("too short"));
	}
	
	private class FakeLogger implements ILogger {
		public String lastError;
		
		@Override
		public void logError(String message) {
			lastError = message;
		}
	}
}
