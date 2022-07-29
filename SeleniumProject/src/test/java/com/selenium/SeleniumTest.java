package com.selenium;

import com.tutorial.Browser;
import com.tutorial.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeleniumTest {

    @Test
    public void canGoToHomePage(){
    Pages.homePage().goTo();
    Assertions.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToAuthorPages(){
        Pages.authorPages().goTo();
        Assertions.assertTrue(Pages.authorPages().isAt());
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }

}
