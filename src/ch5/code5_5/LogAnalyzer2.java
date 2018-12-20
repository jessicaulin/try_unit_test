package ch5.code5_5;

public class LogAnalyzer2 {
	
	private ILogger logger;
	private IWebService webService;

	public LogAnalyzer2(ILogger logger, IWebService webService) {
		this.logger = logger;
		this.webService = webService;
	}

	public int minNameLength;
	
	public void analyze(String fileName) {
		if (fileName.length() < minNameLength) {
			try {
				logger.logError("Filename too short: " + fileName);
			} catch (Exception e) {
				webService.write("Error Form Logger: " + e);
			}
		}
	}
}
