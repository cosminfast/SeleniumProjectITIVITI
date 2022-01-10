package tests;

import org.junit.Assert;
import org.junit.Test;

public class SearchTests extends BaseTest{


    @Test
    public void searchTest() throws InterruptedException {
        driver.get("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q=neck");
        Assert.assertTrue(searchResultsPage.findElementInSearchResults("MERINO V-NECK PULLOVER SWEATER"));
        Thread.sleep(1500);
    }
}
