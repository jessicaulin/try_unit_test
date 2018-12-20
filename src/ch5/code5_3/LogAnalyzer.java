package ch5.code5_3;

public class LogAnalyzer {
	
	public int minNameLength;
	private ILogger logger;

	public LogAnalyzer(ILogger logger) {
		this.logger = logger;
	}

	public void analyze(String minName) {
		if (minName.length() < minNameLength) {
			logger.logError("Filename too short: " + minName);
		} else {
			logger.logError("ok");
		}
	}
}
