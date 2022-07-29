package com.tutorial;

public class AuthorPages {

    static String url = "http://www.pluralsight.com/authors";
    static String title = "|";

    public void goTo() {
        Browser.goTo(url);
    }


    public boolean isAt() {
        return Browser.getTitle().contains(title);
    }


}
