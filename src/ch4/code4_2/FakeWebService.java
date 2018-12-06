package ch4.code4_2;

public class FakeWebService implements IWebService {
	
	public Exception toThrow;
	
	@Override
	public void logError(String message) throws Exception {
		if(toThrow != null) {
			throw toThrow;
		}
	}
	
}
