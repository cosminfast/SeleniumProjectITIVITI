package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailField = By.id("email");
    private By passField = By.id("pass");
    private By loginButton = By.id("send2");

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassField(String pass){
        driver.findElement(passField).sendKeys(pass);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

}
