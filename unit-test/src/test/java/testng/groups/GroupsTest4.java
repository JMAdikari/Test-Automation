package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest4 {

    @Test(groups = {"reg","smoke"})
    public void testGT4_M1() {
        System.out.println(" Group Test 4 M1");
    }

    @Test(groups = {"smoke"})
    public void testGT4_M2() {
        System.out.println(" Group Test 4 M2");
    }

    @Test(groups = {"reg"})
    public void testGT4_M3() {
        System.out.println(" Group Test 4 M3");
    }

    @Test
    public void testGT4_M4() {
        System.out.println(" Group Test 4 M4");
    }

    @Test(groups = {"reg"})
    public void testGT4_M5() {
        System.out.println(" Group Test 4 M5");
    }
}
