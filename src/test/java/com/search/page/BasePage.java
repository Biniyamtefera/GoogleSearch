package com.search.page;

import com.search.utilities.ConfigurationReader;
import com.search.utilities.Driver;
import org.testng.annotations.BeforeMethod;

public class BasePage {

    public void openGoogleBrowser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
    }

    public void openAmazonBrowser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon"));
    }
}
