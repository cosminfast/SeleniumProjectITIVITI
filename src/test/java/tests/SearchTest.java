package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchTest {


    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q=neck");
    }

    @Test
    public void searchTest(){
//        List<WebElement> listOfProducts = driver.findElements(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > h2 > a"));
        String allProducts = driver.findElement(By.cssSelector(".category-products")).getText();
        Assert.assertTrue(allProducts.contains("SILVER DESERT NECKLACE"));
        Select select = new Select(driver.findElement(By.cssSelector(".category-products")));
        select.selectByIndex(3);
        select.selectByValue("Ioan");
        select.selectByVisibleText("Position");
    }
    @After
    public void quit(){
        driver.quit();
    }
}
