package com.search.test;

import com.search.page.AmazonPage;
import com.search.page.BasePage;
import com.search.page.GoogleSearchPages;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazoneSearch {
    Logger log = Logger.getLogger(GoogleSearch.class);
    @BeforeMethod
    public void openAmazonSearchPage() {
        BasePage basePage = new BasePage();
        basePage.openAmazonBrowser();
        log.info("entering application URL");
    }

    @Test
    public void searchKeyWord() {
        /**
         * Calling google search page to access webElement and method called for action
         */
        AmazonPage amazonPage =new AmazonPage();
       amazonPage.searchBox.sendKeys("Ethiopian History" + Keys.ENTER);

    }

}
