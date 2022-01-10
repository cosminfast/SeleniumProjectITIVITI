package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {

    private WebDriver driver;
    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    private By searchItems = By.cssSelector(".products-grid .item");
    private By productName = By.cssSelector(".product-name a");

    public boolean findElementInSearchResults(String name){
        List<WebElement> listOfItems = driver.findElements(searchItems);
        for (WebElement element : listOfItems){
            if (element.findElement(productName).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("a")).click();
                return true;
            }
        }
        return false;
    }


}
