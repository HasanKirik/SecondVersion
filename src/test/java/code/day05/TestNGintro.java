package code.day05;

import org.testng.annotations.*;

public class TestNGintro {

    @BeforeClass
    public void setupBeforeClass(){System.out.println("BeforeClass is running");}

    @AfterClass
    public void setupAfterClass(){System.out.println("AfterClass is running");}

    @BeforeMethod
    public void setup(){System.out.println("This before method,it is running");}

    @AfterMethod
    public void closing(){System.out.println("This is after method,it is running");}



    @Test
    public void TC1(){System.out.println("Test 1 is running");}



    @Test
    public void TC2(){System.out.println("Test 22 running");}



}
