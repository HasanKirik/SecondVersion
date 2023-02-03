package code.day05;

import org.testng.Assert;
import org.testng.annotations.*;

public class c3_TestNGEexample {

    @BeforeClass
    public void setupBeforeClass(){System.out.println("BeforeClass is running");}

    @AfterClass
    public void setupAfterClass(){System.out.println("AfterClass is running");}

    @BeforeMethod
    public void setup(){System.out.println("This before method,it is running");}

    @AfterMethod
    public void closing(){System.out.println("This is after method,it is running");}

    @Test (priority = 3,dependsOnMethods = "TC3")
    public void TC1(){
        System.out.println("Test 1 is running");
    }

    @Test (priority = 1)
    public void TC3(){
        System.out.println("Test 3 is running");

        int age1=40;
        int age2=40;

        Assert.assertEquals(age1,age2,"age verifification has failed");


    }

    @Test (priority = 2)
    public void TC2(){
        System.out.println("Test 2 is running");
        String country1="USA";
        String country2="USA America";
        Assert.assertTrue(country2.contains(country1));

    }

    @Ignore
    @Test
    public void TC4(){
        System.out.println("Test4 is running");
    }
}
