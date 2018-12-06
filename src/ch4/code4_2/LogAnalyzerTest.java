package ch4.code4_2;

import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void analyze_WebServiceThrows_SendsEmail() {
		FakeWebService stubService = new FakeWebService();
		stubService.toThrow = new Exception("fake exception");
		
		FakeEmailService mockEmail = new FakeEmailService();
		
		LogAnalyzer log = new LogAnalyzer(stubService, mockEmail);
		String tooShortFileName = "abc.ext";
		
		log.analyze(tooShortFileName);
		
		Assert.assertTrue(mockEmail.to.contains("someone@somewhere.com"));
		Assert.assertTrue(mockEmail.body.contains("fake exception"));
		Assert.assertTrue(mockEmail.subject.contains("can't log"));
		
	}

}
