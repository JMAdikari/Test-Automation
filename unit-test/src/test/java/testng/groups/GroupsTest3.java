package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest3 {

    @Test(groups = {"reg"})
    public void testGT3_M1() {
        System.out.println(" Group Test 3 M1");
    }

    @Test(groups = {"smoke"})
    public void testGT3_M2() {
        System.out.println(" Group Test 3 M2");
    }

    @Test(groups = {"reg", "smoke"})
    public void testGT3_M3() {
        System.out.println(" Group Test 3 M3");
    }

    @Test
    public void testGT3_M4() {
        System.out.println(" Group Test 3 M4");
    }
}
