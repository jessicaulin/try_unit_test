package ch5.code5_4;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;

public class FileNameRulesTest {
	
	@Test
	public void returns_ByDefault_WorksForHardCodedArgument() {
		IFileNameRules fakeRules = Mockito.mock(IFileNameRules.class);
		Mockito.when(fakeRules.isValidLogFileName("strict.txt")).thenReturn(true);
		Assert.assertTrue(fakeRules.isValidLogFileName("strict.txt"));
	}
	
	@Test
	public void returns_ByDefault_WorksForHardCodedArgument2() {
		IFileNameRules fakeRules = Mockito.mock(IFileNameRules.class);
		Mockito.when(fakeRules.isValidLogFileName(Mockito.anyString())).thenReturn(true);
		Assert.assertTrue(fakeRules.isValidLogFileName("anything.txt"));
	}
	
	@Test(expected = MockitoException.class)
	public void returns_ArgAny_Throws() {
		IFileNameRules fakeRules = Mockito.mock(IFileNameRules.class);

		
	Mockito.when(fakeRules.isValidLogFileName(Mockito.anyString()))
			   .thenThrow(new Exception("fake exception"));
	}
}
