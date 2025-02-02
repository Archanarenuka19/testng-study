package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.*;

public class PurchaseTest extends TestBase {
    @Test
    public void purchaseTest1(){
       // super.log(Status.INFO,"Launching the broser");
        logBroswser();
        super.log(Status.INFO,"Verification");
        System.out.println("Purchase Test1");

    }
    @Test
    public void purchaseTest2(){
        logBroswser();
        System.out.println("Purchase Test2");

    }
    @Test
    public void purchaseTest3(){
        logBroswser();
        System.out.println("Purchase Test3");
        Assert.fail("Some verification failed");

    }
    }
