package chapterthree.g;

public class LogAnalyzerUsingFactoryMethod {
	public boolean isValidLogFileName(String fileName) {
		return this.isValid(fileName);
	}

	protected boolean isValid(String fileName) {
		FileExtensionManagerImp mgr = new FileExtensionManagerImp();
		return mgr.isValid(fileName);
	}
}

