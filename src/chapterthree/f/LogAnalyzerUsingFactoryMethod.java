package chapterthree.f;

public class LogAnalyzerUsingFactoryMethod {
	public boolean isValidLogFileName(String fileName) {
		return getManager().isValid(fileName);
	}
	
	private ExtensionManager getManager() {
		return new FileExtensionManagerImp();
	}
}
