package chapterthree.b;

public class LogAnalyzer {
	private ExtensionManager manager;
	
	public LogAnalyzer(ExtensionManager manager) {
		super();
		this.manager = manager;
	}
	
	public boolean isValidLogFileName(String fileName) {
		return manager.isValid(fileName);
	}
}
