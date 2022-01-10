package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentials(){


//        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        accountLink.click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        WebElement welcomeElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        String welcomeText = welcomeElement.getText();
//        if (welcomeText.equals("Hello, Cosmin Fast!"))
//            System.out.println("SUCCESS!");
//        else
//            System.err.println("FAIL");
        Assert.assertTrue(welcomeElement.isDisplayed());
        Assert.assertEquals("Textele nu sunt la fel!","Hello, Cosmin Fast!", welcomeText);

    }


    @Test
    public void loginWithInValidCredentials(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);

        homePage.clickMyAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("cosmin@fasttrackit.org");
        loginPage.setPassField("123456");
        loginPage.clickLoginButton();
        Assert.assertTrue(myAccountPage.isUserLoggedIn("Cosmin Fast"));

    }


}
