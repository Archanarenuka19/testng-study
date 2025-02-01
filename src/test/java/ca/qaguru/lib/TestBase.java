package ca.qaguru.lib;

import org.testng.annotations.*;

public class TestBase {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
   @Parameters({"browser"})
    @BeforeClass
    public void beforeClass( String browser){
        System.out.println("Before Class:"+browser);
           }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
