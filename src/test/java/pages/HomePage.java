package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By accountLink = By.cssSelector(".skip-account .label");
    private By loginLink = By.cssSelector("a[title='Log In']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickMyAccountLink(){
        driver.findElement(accountLink).click();
    }

    public void clickLoginLink(){
        driver.findElement(loginLink).click();
    }
}
