package chaptertwo.test;

import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chaptertwo.exception.ArgumentException;
import chaptertwo.product.LogAnalyzer;

@RunWith(Parameterized.class)
public class LogAnalyzerTest {
	
	private String fileName;
	private boolean expected;
	LogAnalyzer m_analyzer;
	
	@Before
	public void before() {
		m_analyzer = new LogAnalyzer();
	}
	
    public LogAnalyzerTest(String fileName, boolean expected) {  
        super();  
        this.fileName = fileName;
        this.expected = expected;
    }  
   
    @Parameters  
    public static Collection<Object[]> data() {  
        Object[][] data = new Object[][] {  
                { "filewithbadextension.foo", false },  
                { "filewithgoodextension.slf", true },  
                { "filewithgoodextension.SLF", true }  
        };  
        return Arrays.asList(data);  
    }
    
	@Test
	public void isValidLogFileName_BadExtension_ReturnsFalse() throws ArgumentException {
		LogAnalyzer analyzer = new LogAnalyzer();
		
		boolean result = analyzer.isValidLogFileName("filewithbadextension.foo");
		
		Assert.assertFalse(result);
	}
	
	@Test
	public void IsValidLogFileName_GoodExtensionLowercase_ReturnsTure() throws ArgumentException {
		LogAnalyzer analyzer = new LogAnalyzer();
		
		boolean result = analyzer.isValidLogFileName("filewithgoodextension.slf");
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void IsValidLogFileName_GoodExtensionUppercase_ReturnsTure() throws ArgumentException {
		LogAnalyzer analyzer = new LogAnalyzer();
		
		boolean result = analyzer.isValidLogFileName("filewithgoodextension.SLF");
		
		Assert.assertTrue(result);
	}
	@Test
	public void IsValidLogFileName_VariousExtensions_ChecksThem() throws ArgumentException {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean result = analyzer.isValidLogFileName(fileName);
		
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void isValidFileName_ValidFileLowerCased_ReturnsTure() throws ArgumentException {
		boolean result = m_analyzer.isValidLogFileName("whatever.slf");
		
		Assert.assertTrue("filename should be valid!", result);
	}
	
	@Test
	public void isValidFileName_ValidFileUpperCased_ReturnsTure() throws ArgumentException {
		boolean result = m_analyzer.isValidLogFileName("whatever.SLF");
		
		Assert.assertTrue("filename should be valid!", result);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void isValidFileName_EmptyFileName_ThrowsException() throws ArgumentException {
		thrown.expect(ArgumentException.class);
		thrown.expectMessage("filename has to be provided");
		m_analyzer.isValidLogFileName(null);
	}
	
	@Test(expected = ArgumentException.class)
	@Ignore
	public void isValidFileName_EmptyFileName_ThrowsException2() throws ArgumentException {
		m_analyzer.isValidLogFileName(null);
	}
	
	@Test
	public void isValidFileName_EmptyFileName_ThrowsException3() {
	    try {
			m_analyzer.isValidLogFileName(null);
	        Assert.fail("Expected an ArgumentException to be thrown");
	    } catch (ArgumentException e) {
	    	Assert.assertThat(e.getMessage(), is("filename has to be provided"));
	    }
	}
	
	@Test
	public void isValidLogFileName_WhenCalled_ChangesWasLastFileNameValid() throws ArgumentException {
		m_analyzer.isValidLogFileName("badname.foo");
		
		Assert.assertFalse(m_analyzer.wasLastFileNameValid);
	}
	
	@Test
	public void isValidLogFileName_WhenCalled_ChangesWasLastFileNameValid1() throws ArgumentException {
		m_analyzer.isValidLogFileName(fileName);
		
		Assert.assertEquals(expected, m_analyzer.wasLastFileNameValid);
	}
	
	@After
	public void After() {
		m_analyzer = null;
	}
}
