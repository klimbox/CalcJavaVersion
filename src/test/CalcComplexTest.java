package test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.Calculator;

@RunWith(Parameterized.class)
public class CalcComplexTest {

	private FrameFixture calc;
 	private String num1;
 	private String num2;
    private String expected;
    
	@Before
	public void setUp() {
		calc = new FrameFixture(new Calculator());
	}
	@After
	public void tearDown() {
		calc.cleanUp();
	}
	
    public CalcComplexTest(String numberA, String numberB, String expected) 
    {
        this.num1 = numberA;
        this.num2 = numberB;
        this.expected = expected;
    }

    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1","2","12"},
                {"2","3","23"},
                {"3","4","34"},
                {"4","5","45"},
                {"5","6","56"},
                {"6","7","67"},
                {"7","8","78"},
                {"8","9","89"},
                {"9","0","90"}
        });
    }
	
    @Test
	public void testComplex() 
	{	
		calc.button(num1).click();
		calc.button(num2).click();
		assertEquals(expected, calc.textBox("display").text());
	}
}
