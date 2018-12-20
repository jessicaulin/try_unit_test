package ch5.code5_5;

public class FakeLogger2 implements ILogger {
	
	public Exception willThrow = null;
	public String loggerGotMessage = null;
	
	@Override
	public void logError(String message) throws Exception {
		loggerGotMessage = message;
		
		if (willThrow != null) {
			throw willThrow;
		}
	}

}
