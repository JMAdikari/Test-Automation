package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest1 {

    ArithmeticOperator cal; //calling arithmetic class

    @BeforeMethod
    public void setUp() {
        // creating method
        cal = new ArithmeticOperator();

    }

    /*@Test
    public void testSum() {

        Assert.assertEquals(cal.sum(100, 200), 300, "Failed to calculate sum");
        System.out.println("******Before assert failure*********");
        Assert.assertEquals(cal.sum(-1000, -200), -300, "Failed to calculate sum");
        System.out.println("******after assert failure*********");
        Assert.assertEquals(cal.sum(0, 1), 1, "Failed to calculate sum");
        Assert.assertEquals(cal.sum(0, -1), -1, "Failed to calculate sum");
    }*/
    // crl +shift+/ to comment all selected codes

    @Test
    public void testSum1() {

        Assert.assertEquals(cal.sum(100, 200), 300, "Failed to calculate sum");

    }

    @Test
    public void testSum2() {
        Assert.assertEquals(cal.sum(-1000, -200), -300, "Failed to calculate sum");
    }

    @Test
    public void testSum3() {
        Assert.assertEquals(cal.sum(0, 1), 1, "Failed to calculate sum");
    }

    @Test
    public void testSum4() {
        Assert.assertEquals(cal.sum(0, -1), -1, "Failed to calculate sum");
    }
}
