package chapterthree.e;

public class ExtensionManagerFactory {
	private static ExtensionManager customManager = null;
	
	public ExtensionManager create() {
		if(customManager != null) {
			return customManager;
		}
		
		return new FileExtensionManagerImp();
	}
	
	public static void setManager(ExtensionManager manager) {
		customManager = manager;
	}
}
