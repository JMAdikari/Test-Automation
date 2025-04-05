package testng.annotations;

import org.testng.annotations.*;

public class TestNGAnnotationTest4 {

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println(" before method");
    }


    @AfterMethod
    public void tearDown() {
        System.out.println(" after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(" Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(" After class");
    }
}
