package com.grocery;

import com.tutorial.Browser;

public class WelcomePage {
    static String url = "http://localhost:4200/welcome";
    public void goTo() {
        BrowserGroceryStore.goTo(url);
    }
    public String  getTextElementById(String elementId) {
      return  BrowserGroceryStore.getTextElementById(elementId);
    }
    public void clickElementById(String elementId) {
        BrowserGroceryStore.clickElementById(elementId);
    }

}
