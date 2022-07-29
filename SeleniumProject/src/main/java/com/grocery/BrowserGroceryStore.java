package com.grocery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BrowserGroceryStore {
    static WebDriver driver = new ChromeDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    public static void goTo(String url) {
        driver.get(url);
    }

    public static String getTextElementById(String elementId) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
        return driver.findElement(By.id(elementId)).getText();
    }

    public static void clickElementById(String elementId) {
        driver.findElement(By.id(elementId)).click();
    }


    public static WebElement findElementById(String elementId){
        return driver.findElement(By.id(elementId));
    }
    public static List<WebElement> findElementsByClass(String className) {
       return driver.findElements(By.className(className));
    }

    public static void close() {
        driver.close();
    }


}
