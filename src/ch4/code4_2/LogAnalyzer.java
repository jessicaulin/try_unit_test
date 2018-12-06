package ch4.code4_2;

public class LogAnalyzer {
	private IWebService service;
	private IEmailService email;
	
	public LogAnalyzer(IWebService service, IEmailService email) {
		this.service = service;
		this.email = email;
	}
	
	public void analyze(String fileName) {
		if (fileName.length() < 8) {
			try {
				service.logError("Filename too short: " + fileName);
			} catch (Exception e) {
				email.sendEmail("someone@somewhere.com", "can't log", e.getMessage());
			}
		}
	}
}

