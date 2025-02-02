package ca.qaguru.lib;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;

@Listeners(ExtentITestListenerClassAdapter.class)// Adapter will integrate testng results with extent report
public class TestBase {
    protected String browser;
    @BeforeTest
    protected void beforeTest(){

        System.out.println("Before Test");
    }
    @BeforeMethod
    protected void beforeMethod(){

        System.out.println("Before Method");
    }
    @AfterMethod
    protected void afterMethod(){

        System.out.println("After Method");
    }
    @AfterTest
    protected void afterTest(){

        System.out.println("After Test");
    }
   @Parameters({"browser"})
    @BeforeClass
    public void beforeClass( String browser){
        this.browser=browser;
        System.out.println("Before Class:"+browser);
           }
    @AfterClass
    protected void afterClass(){

        System.out.println("After Class");
    }
    @BeforeSuite
    protected void beforeSuite(){

        System.out.println("Before Suite");
    }
    @AfterSuite
    protected void afterSuite(){

        System.out.println("After Suite");
    }
    protected void log(Status status, String message){
        ExtentTestManager.getTest().log(status,message);
    }
    protected void logBroswser(){
        log(Status.INFO,"Launching the browser-"+this.browser);
    }
}
