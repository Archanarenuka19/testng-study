package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InventoryTests extends TestBase {
    @Test
    public void inventoryTest1(){
        logBroswser();
        System.out.println("inventoryTest1");
    }
    @Test
    public void inventoryTest3(){
        logBroswser();
        System.out.println("inventoryTest3");
    }
    @Test
    public void inventoryTest2(){
        logBroswser();
        System.out.println("inventoryTest2");
    }
    @Test(dataProvider = "dpLogin",dataProviderClass = InventoryTests.class)
    public void LoginTest(String username, String password){
        System.out.println("Username :"+username+"Password :"+password);
    }
    @DataProvider(name="dpLogin")
    public Object[][] loginData(){ // returns a two diamensional object array
        return new Object[][]{
                {"john", "alpha"},
                {"david", "beta"},
                {"sara", "gamma"}

        };
    }
}
