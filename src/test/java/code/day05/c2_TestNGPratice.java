package code.day05;

import org.testng.Assert;
import org.testng.annotations.*;

public class c2_TestNGPratice {


    @BeforeClass
    public void setupBeforeClass(){System.out.println("BeforeClass is running");}

    @AfterClass
    public void setupAfterClass(){System.out.println("AfterClass is running");}

    @BeforeMethod
    public void setup(){System.out.println("This before method,it is running");}

    @AfterMethod
    public void closing(){System.out.println("This is after method,it is running");}

    @Test (priority = 3)
    public void TC1(){

        System.out.println("Test 1 is running");

    }


    @Test (priority = 1)
    public void TC3(){

        System.out.println("Test 3 is running");

        String expectedbestDrink="coffe";
        String actualBestDrink="tea";


        Assert.assertEquals(expectedbestDrink,actualBestDrink,"Verification has failed");

        // If assertion is failed the rest of code block will not be executed !!!!!!

        System.out.println("TC1 is done");


    }

    @Test (priority = 2)
    public void TC2(){
        System.out.println("Test 2 is running");
        String expectedBestFood="coxinha";
        String actualFood="coxinha";
        Assert.assertEquals(actualFood,expectedBestFood,"Food Verification has failed");

    }


}



