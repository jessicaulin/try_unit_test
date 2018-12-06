package ch4.code4_1;

public class LogAnalyzer {
	private IWebService service;
	
	public LogAnalyzer(IWebService service) {
		this.service = service;
	}
	
	public void analyze(String fileName) {
		if (fileName.length() < 8) {
			service.logError("Filename too short: " + fileName);
		}
	}
}

