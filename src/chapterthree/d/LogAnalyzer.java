package chapterthree.d;

public class LogAnalyzer {
	private ExtensionManager manager;
	
	public LogAnalyzer() {
		super();
		manager = new FileExtensionManagerImp();
	}
	
	public void setExtensionManager(ExtensionManager extensionManager) {
		this.manager = extensionManager;
	}

	public boolean isValidLogFileName(String fileName) {
		return manager.isValid(fileName);
	}
}
