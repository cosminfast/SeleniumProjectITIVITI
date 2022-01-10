package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.SearchResultsPage;

public class BaseTest {


    public WebDriver driver;
    public HomePage homePage ;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public SearchResultsPage searchResultsPage;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);
        searchResultsPage = new SearchResultsPage(driver);

    }


    @After
    public void quit(){
        driver.quit();
    }
}
