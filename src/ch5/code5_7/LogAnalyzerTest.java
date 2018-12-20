package ch5.code5_7;

import org.junit.Test;
import org.mockito.Mockito;

public class LogAnalyzerTest {
	@Test
	public void analyze_LoggerThrows_CallsWebService() throws Exception {
		IWebService mockWebService = Mockito.mock(IWebService.class);
		
		ILogger stubLogger = Mockito.mock(ILogger.class);
		Mockito.doThrow(new Exception("fake exception")).when(stubLogger).logError(Mockito.anyString());
		
		LogAnalyzer2 analyzer2 = new LogAnalyzer2(stubLogger, mockWebService);
		analyzer2.minNameLength = 10;
		
		analyzer2.analyze("Short.ext");
		
		ErrorInfo expected = new ErrorInfo(1000, "fake exception");
		
		Mockito.verify(mockWebService).write(expected);
	}
}
