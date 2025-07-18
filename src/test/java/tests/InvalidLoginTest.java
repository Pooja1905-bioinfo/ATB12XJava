package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest {
    @Test
    public void testInvalidLogin(){
        LoginPage invalidlogin = new LoginPage(driver);

        invalidlogin.enterUsername("pooja");
        invalidlogin.enterPassword("1234");
        invalidlogin.clickLogin();
        System.out.println("Title of the page is " + driver.getTitle());
        //ssert.assertEquals(driver.getTitle(),"Logged In Successfully | Practice Test Automation");



    }
}
