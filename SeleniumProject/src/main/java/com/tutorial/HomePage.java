package com.tutorial;

public class HomePage {

    static String url = "http://www.pluralsight.com";
    static String title = "|";

    public void goTo() {
        Browser.goTo(url);
    }


    public boolean isAt() {
        return Browser.getTitle().contains(title);
    }


}
