package chapterthree.b;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void isValidLogFileName_nameSupportedExtension_returnsTure() {
		FakeExtensionManager myFakeManager = new FakeExtensionManager();
		myFakeManager.willBeValid = true;
		LogAnalyzer log = new LogAnalyzer(myFakeManager);
		boolean result = log.isValidLogFileName("short.ext");
		
		assertTrue(result);
	}

	private class FakeExtensionManager implements ExtensionManager{
		public boolean willBeValid = false;
		
		public boolean isValid(String fileName) {
			return willBeValid;
		}
	}

}
