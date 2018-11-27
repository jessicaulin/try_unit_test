package chapterthree.c;

public class LogAnalyzer {
	private ExtensionManager manager;
	
	public LogAnalyzer(ExtensionManager manager) {
		super();
		this.manager = manager;
	}
	
	public boolean isValidLogFileName(String fileName) throws Exception {
		return manager.isValid(fileName);
	}
}
