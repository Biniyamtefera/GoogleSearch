package com.search.page;

import com.search.utilities.Driver;
import com.search.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage extends BasePage{
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;




}
