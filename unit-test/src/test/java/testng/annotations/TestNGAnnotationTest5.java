package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationTest5 {

    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test
    public void testCreate() {
        System.out.println("Create");
    }

    @Test
    public void TC_002_testEdit() {
        System.out.println(" Edit");
    }

    @Test
    public void TC_004_testDelete() {
        System.out.println(" Delete");
    }

    @Test
    public void TC_005_testLogout() {
        System.out.println(" Logout");
    }
}
