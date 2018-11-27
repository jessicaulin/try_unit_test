package chapterthree.c;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogAnalyzerTest {

	@Test
	public void isValidLogFileName_extManagerThrowsException_returnsFalse() {
		boolean result = true;
		FakeExtensionManager myFakeManager = new FakeExtensionManager();
		myFakeManager.willThrow = new Exception("This is Fake");
		LogAnalyzer log = new LogAnalyzer(myFakeManager);
		
		try {
			result = log.isValidLogFileName("anything.anyextension");
		} catch (Exception e) {
			result = false;
		}
		
		assertFalse(result);
	}

	private class FakeExtensionManager implements ExtensionManager{
		public boolean willBeValid = false;
		public Exception willThrow = null;
		
		public boolean isValid(String fileName) throws Exception {
			if (willThrow != null) {
				throw willThrow;
			}
			return willBeValid;
		}
	}

}
