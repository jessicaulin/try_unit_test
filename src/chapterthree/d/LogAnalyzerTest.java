package chapterthree.d;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void isValidLogFileName_supportedExtension_returnsTure() {
		LogAnalyzer log = new LogAnalyzer();
		log.setExtensionManager(new FakeExtensionManager());
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
