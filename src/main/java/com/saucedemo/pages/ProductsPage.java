package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public ProductsPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElement> productsNum;

    public String getProductText(){
        String message = getTextFromElement(productsText);
        log.info("Getting text from: " + productsText.toString());
        return message;
    }

    public int findActualNoOfProducts(){
        log.info("Finding total Number of Products" + productsNum.size());
        return productsNum.size();
    }
}
