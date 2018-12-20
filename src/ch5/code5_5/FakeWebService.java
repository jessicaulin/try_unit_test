package ch5.code5_5;

public class FakeWebService implements IWebService {
	public String messageToWebService;
	
	@Override
	public void write(String message) {
		messageToWebService = message;
	}
}
