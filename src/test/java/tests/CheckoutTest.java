package tests;

import org.junit.Test;

public class CheckoutTest extends BaseTest{


    @Test
    public void validCheckoutTest(){
        homePage.clickMyAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("Cosmin");
        loginPage.setPassField("123456");
        loginPage.clickLoginButton();
        myAccountPage.isUserLoggedIn("Cosmin Fast");
    }
}
