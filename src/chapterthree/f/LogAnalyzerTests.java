package chapterthree.f;

import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTests {

	@Test
	public void overrideTest() {
		FakeExtensionManager stub = new FakeExtensionManager();
		stub.willBeValid = true;
		
		TestableLogAnalyzer logan = new TestableLogAnalyzer(stub);
		boolean result = logan.isValidLogFileName("file.ext");
		
		Assert.assertTrue(result);
	}

	private class TestableLogAnalyzer extends LogAnalyzerUsingFactoryMethod {

		private ExtensionManager Manager;
		
		public ExtensionManager getManager() {
			return Manager;
		}

		public TestableLogAnalyzer(ExtensionManager mgr) {
			Manager = mgr;
		}
		
		@Override
		public boolean isValidLogFileName(String fileName) {
			return getManager().isValid(fileName);
		}
	}

	private class FakeExtensionManager implements ExtensionManager {
		boolean willBeValid = false;
		@Override
		public boolean isValid(String fileName) {
			return true;
		}
	}

}
