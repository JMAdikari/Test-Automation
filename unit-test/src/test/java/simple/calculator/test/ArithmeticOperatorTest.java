package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    ArithmeticOperator cal; //calling arithmetic class

    @BeforeMethod
    public void setUp() {
        // creating method
        cal = new ArithmeticOperator();
        
    }

    @Test
    public void testSum() {
        int actualSum = cal.sum(100, 200);  // sum should be 300
        Assert.assertEquals(actualSum, 300, "Failed to calculate sum");
    }
}
