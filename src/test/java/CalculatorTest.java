import org.junit.Test;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void testsqrt(){
        assertEquals("Square root of positive integer", 10, calculator.squareRoot(100),DELTA);
        assertEquals("Square root of positive integer", 10, calculator.squareRoot(100),DELTA); //for decimal
        assertEquals("Square root of negative integer", NaN, calculator.squareRoot(-4), DELTA);
    }
    @Test
    public void testlog(){
        assertEquals("Log of positive number", 2.302585092994046, calculator.logarithm(10), DELTA);
        assertEquals("Log of negative number", NaN, calculator.logarithm(-9), DELTA);
        assertEquals("Log of 0", -NEGATIVE_INFINITY, calculator.logarithm(0), DELTA);
        assertEquals("Log of negative number", NaN, calculator.logarithm(-9), DELTA);
    }
    @Test
    public void testpow(){
        assertEquals("Power of a and b where a and b are positive", 81, calculator.power(3,4), DELTA);
        assertEquals("Power of a and b where a and b are negetive", 0.25, calculator.power(-2,-2), DELTA);
        assertEquals("Power of a and b where a is negative and b is positive", 81, calculator.power(-3,4), DELTA);
        assertEquals("Power of a and b where a is positive and b is negetive", 0.25, calculator.power(2,-2), DELTA);

    }
    @Test
    public void testfact(){
        assertEquals("Fatorial of a where a is positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Fatorial of a where a is positive", 1, calculator.factorial(0), DELTA);
        assertEquals("Fatorial of a where a is negative", 1, calculator.factorial(-23), DELTA);
        assertEquals("Fatorial of a where a is positive", 1, calculator.factorial(1), DELTA);
        assertEquals("Fatorial of a where a is positive", 39916800, calculator.factorial(11), DELTA);
       
    }
}
