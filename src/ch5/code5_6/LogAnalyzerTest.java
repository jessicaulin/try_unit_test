package ch5.code5_6;

import org.junit.Test;
import org.mockito.Mockito;

import ch5.code5_5.IWebService;
import ch5.code5_5.LogAnalyzer2;
import ch5.code5_5.ILogger;

public class LogAnalyzerTest {
	//用Mockito取代 5-5的測試內容
	@Test
	public void analyze_LoggerThrows_CallsWebService() throws Exception {
		IWebService mockWebService = Mockito.mock(IWebService.class);
		
		ILogger stubLogger = Mockito.mock(ILogger.class);
		Mockito.doThrow(new Exception("fake exception")).when(stubLogger).logError(Mockito.anyString());
		
		LogAnalyzer2 analyzer2 = new LogAnalyzer2(stubLogger, mockWebService);
		analyzer2.minNameLength = 10;
		
		analyzer2.analyze("Short.ext");
		
		Mockito.verify(mockWebService).write(Mockito.contains("fake exception"));
	}
}
