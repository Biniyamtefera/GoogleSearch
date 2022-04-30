package com.search.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /**
     * Creating a private constructor so this class object is not reachable from outside.

     */
    private Driver(){

    }
    /**
     Making our 'driver instant private so that it is not reachable from outside of the class'
     We want it static , because we want to run before everythingelse, and also we will use it in static method
     */
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    /**
     Creating re-usable utility method that will return same driver instance everytime we call it.
     */
    public static WebDriver getDriver() {
        if(driverPool.get() == null) {
            /**
             We read browser type from configration file using .getProperty method we creating in Configuration class.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            synchronized ((Driver.class)) {
                /**
                 Depending on the browser type our switch statment will determine to open specific
                 type of browser/driver
                 */

                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                        break;

                }
            }
        }
        return driverPool.get();
    }
    /*
    This method make sure we have some form of driver session pr driver id has
     */
    public static void closeDriver(){
        if (driverPool.get()!=null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
