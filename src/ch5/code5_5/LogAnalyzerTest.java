package ch5.code5_5;

import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void analyze_LoggerThrows_CallsWebService() {
		FakeWebService mockWebService = new FakeWebService();
		
		FakeLogger2 stubLogger = new FakeLogger2();
		stubLogger.willThrow = new Exception("fake exception");
		
		LogAnalyzer2 analyzer2 = new LogAnalyzer2(stubLogger, mockWebService);
		analyzer2.minNameLength = 8;
		
		String tooShortFileName = "abc.ext";
		
		analyzer2.analyze(tooShortFileName);
		
		Assert.assertTrue(mockWebService.messageToWebService.contains("fake exception"));
		
		
	}

}
