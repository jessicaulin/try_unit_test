package chapterthree.a;

public class LogAnalyzer {
	public boolean isValidLogFileName(String fileName) {
		FileExtensionManagerImp mgr = new FileExtensionManagerImp();
		return mgr.isValid(fileName);
	}
}

