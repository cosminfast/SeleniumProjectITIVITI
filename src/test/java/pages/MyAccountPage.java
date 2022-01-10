package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    private By helloMessage = By.cssSelector(".hello strong");

    public boolean isUserLoggedIn(String userName){
        return driver.findElement(helloMessage).getText().equalsIgnoreCase("Hello, "+userName+"!");
    }

}
