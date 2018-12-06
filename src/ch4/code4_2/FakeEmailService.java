package ch4.code4_2;

public class FakeEmailService implements IEmailService {
	public String to;
	public String subject;
	public String body;
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
}
