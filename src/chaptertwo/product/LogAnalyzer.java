package chaptertwo.product;

import chaptertwo.exception.ArgumentException;

public class LogAnalyzer {
	public boolean wasLastFileNameValid = false;
	
	public boolean isValidLogFileName(String fileName) throws ArgumentException {
		if (fileName == null || fileName.isEmpty()) {
			throw new ArgumentException("filename has to be provided");
		}
		if(!fileName.toUpperCase().endsWith(".SLF")) {
			return false;
		}
		wasLastFileNameValid = true;
		return true;
	}
}
