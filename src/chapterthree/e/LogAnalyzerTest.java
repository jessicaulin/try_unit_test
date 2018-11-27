package chapterthree.e;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void isValidLogFileName_supportedExtension_returnsTure() {
		FakeExtensionManager myFakeManager = new FakeExtensionManager();
		ExtensionManagerFactory.setManager(myFakeManager);
		LogAnalyzer log = new LogAnalyzer();
		
		boolean result = log.isValidLogFileName("short.ext");
		
		assertTrue(result);
	}

	private class FakeExtensionManager implements ExtensionManager{
		public boolean willBeValid = true;
		
		public boolean isValid(String fileName) {
			return willBeValid;
		}
	}

}
