package ch4.code4_1;

public class FakeWebService implements IWebService {
	public String LastError;

	@Override
	public void logError(String message) {
		LastError = message;
	}
	
}
