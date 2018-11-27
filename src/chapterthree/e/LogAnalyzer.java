package chapterthree.e;

public class LogAnalyzer {
	private ExtensionManager manager;
	
	public LogAnalyzer() {
		super();
		ExtensionManagerFactory factory = new ExtensionManagerFactory();
		this.manager = factory.create();
	}
	
	public boolean isValidLogFileName(String fileName) {
		return manager.isValid(fileName);
	}
}
