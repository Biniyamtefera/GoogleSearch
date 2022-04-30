package com.search.test;

import com.search.page.BasePage;
import com.search.page.GoogleSearchPages;
import com.search.utilities.ConfigurationReader;
import com.search.utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearch {
    Logger log = Logger.getLogger(GoogleSearch.class);
    @BeforeMethod
    public void openGoogleSearchPage() {
        BasePage  basePage = new BasePage();
        basePage.openGoogleBrowser();
        log.info("entering application URL");
    }

    @Test
    public void googleHomePage() {
        String actualTitle=Driver.getDriver().getTitle();
        log.info("Actual title page");
        String expectedTitle = "Google";
        log.info("expected title page");
        Assert.assertEquals(actualTitle, expectedTitle);
        log.info("The title page is google");
    }
    @Test
    public void searchKeyWord() {
        /**
         * Calling google search page to access webElement and method called for action
         */
        GoogleSearchPages googleSearchPage = new GoogleSearchPages();
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }
}
