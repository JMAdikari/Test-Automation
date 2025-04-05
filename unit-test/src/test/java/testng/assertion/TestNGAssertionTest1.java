package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest1 {

    @Test
    public void testAssertEquals() {
        String actualValue = "Hello testNG";
        Assert.assertEquals(actualValue, "Hello testNG", "The actual value does not match the expected value");
    }

    @Test
    public void testAssertNotEquals() {
        String actualValue = "Hello testNG test";
        Assert.assertNotEquals(actualValue, "Hello testNG", "The actual value should not match the expected value");

    }

    @Test
    public void testAssertTrue() {
        boolean actualValue = true;
        Assert.assertTrue(actualValue, "The actual value is not true");
    }

    @Test
    public void testAssertFalse() {
        boolean actualValue = false;
        Assert.assertFalse(actualValue, "The actual value is not false");
    }
}
