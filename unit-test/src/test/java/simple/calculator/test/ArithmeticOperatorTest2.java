package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest2 {

    ArithmeticOperator cal; //calling arithmetic class

    @BeforeMethod
    public void setUp() {
        // creating method
        cal = new ArithmeticOperator();

    }

    @Test(dataProvider = "getData") // data provider attribute
    public void testSum(int input1, int input2, int output) {
        int actualSum = cal.sum(input1, input2);  // sum should be 300
        Assert.assertEquals(actualSum, output, "Failed to calculate sum");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {100, 200, 300},//first data combination this one executes first
                {-1000, -200, -1200},
                {0, 1, 1},
                {0, -1, -1} // expected data

        };
    }
}
