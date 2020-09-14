import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Before;
public class CalculatorTest {
    public Calculator objCalcUnderTest;
    int expectedResult;
    private int result;
    @Before
    public void setUp() {
    }
    @Test
    public void testAdd() {
        int a = 20;
        int b = 20;
        expectedResult = 40;
        result = Calculator.plus(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testSubtract() {
        int a = 30;
        int b = 20;
        expectedResult = 10;
        result = Calculator.subtrakt(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testMultiply() {
        int a = 10;
        int b = 30;
        expectedResult = 300;
        result = Calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testDivide() {
        int a = 58;
        int b = 10;
        double expectedResult = 5.8;
        double result = Calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
    
}