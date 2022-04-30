package com.search.page;

import com.search.utilities.ConfigurationReader;
import com.search.utilities.Driver;
import org.testng.annotations.BeforeMethod;

public class BasePage {

    public void openBrowser() {
        // Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

    }
}
