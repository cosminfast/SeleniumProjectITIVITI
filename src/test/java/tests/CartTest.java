package tests;

import org.junit.Test;
public class CartTest extends BaseTest{


    @Test
    public void addToCart(){
        homePage.clickMyAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("Cosmin");
        loginPage.setPassField("123456");
        loginPage.clickLoginButton();
        myAccountPage.isUserLoggedIn("Cosmin Fast");
    }


}
