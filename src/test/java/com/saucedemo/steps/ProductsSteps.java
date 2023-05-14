package com.saucedemo.steps;

import com.saucedemo.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ProductsSteps {
    @Then("^I verify (\\d+) products are displayed on the Products Page$")
    public void iVerifyProductsAreDisplayedOnTheProductsPage(int arg0) {
        int expectedNumberOfProducts = 6;
        int actualNumberOfProducts = new ProductsPage().findActualNoOfProducts();
        Assert.assertEquals(actualNumberOfProducts, expectedNumberOfProducts, "Number of products are not 6");
    }

    @And("^I verify Products text is displayed on the Products Page$")
    public void iVerifyProductsTextIsDisplayedOnTheProductsPage() {
        String expectedMessage = "Products";
        String actualMessage = new ProductsPage().getProductText();
        Assert.assertEquals(expectedMessage, actualMessage, "Products not displayed");
    }
}
