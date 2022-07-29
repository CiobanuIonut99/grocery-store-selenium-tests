package com.grocery;

import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage {
    static String url = "http://localhost:4200/products";

    public void goTo() {
        BrowserGroceryStore.goTo(url);
    }

    public String getTextElementById(String elementId) {
        return BrowserGroceryStore.getTextElementById(elementId);
    }

    public void clickElementById(String elementId) {
        BrowserGroceryStore.clickElementById(elementId);
    }

    public WebElement findElementById(String elementId) {
        return BrowserGroceryStore.findElementById(elementId);
    }

    public List<WebElement> findElementsByClass(String className) {
        return BrowserGroceryStore.findElementsByClass(className);
    }

}
