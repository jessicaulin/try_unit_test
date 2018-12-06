package ch4.code4_1;

import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void analyze_TooShortFileName_CallsWebService() {
		FakeWebService mockService = new FakeWebService();
		LogAnalyzer log = new LogAnalyzer(mockService);
		String tooShortFileName = "abc.ext";
		log.analyze(tooShortFileName);
		
		Assert.assertTrue(mockService.LastError.contains("Filename too short: abc.ext"));
	}

}
