package ch5.code5_3;

import org.junit.Test;
import org.mockito.Mockito;

public class LogAnalyzerTest {

	@Test
	public void analyze_TooShortFileName_CallLogger() {
		ILogger logger = Mockito.mock(ILogger.class);
		LogAnalyzer analyzer = new LogAnalyzer(logger);
		analyzer.minNameLength = 6;
		analyzer.analyze("a.txt");
		Mockito.verify(logger).logError("Filename too short: a.txt");
	}

}
