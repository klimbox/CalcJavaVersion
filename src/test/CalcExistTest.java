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
public class CalcExistTest {

	private FrameFixture calc;
 	private String num;
    private String expected;
    
	@Before
	public void setUp() {
		calc = new FrameFixture(new Calculator());
	}
	@After
	public void tearDown() {
		calc.cleanUp();
	}
	
	
    public CalcExistTest(String number, String expected) 
    {
        this.num = number;
        this.expected = expected;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1","1"},
                {"2","2"},
                {"3","3"},
                {"4","4"},
                {"5","5"},
                {"6","6"},
                {"7","7"},
                {"8","8"},
                {"9","9"},
                {"0","0"}
        });
    }

    
    @Test
	public void testExist() 
	{	
		calc.button(num).click();
		assertEquals(expected, calc.textBox("display").text());
	}

}
