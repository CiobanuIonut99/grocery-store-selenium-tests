package com.grocery.store.test;

import com.grocery.BrowserGroceryStore;
import com.grocery.PagesGroceryStore;
import com.grocery.ProductListPage;
import com.grocery.WelcomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GroceryStoreTest {
    static WelcomePage welcomePage;
    static ProductListPage productListPage;

    @BeforeAll
    public static void setUpBeforeAll() {
        welcomePage = PagesGroceryStore.instantiateWelcomePage();
        productListPage = PagesGroceryStore.instantiateProductListPage();
    }

    @Test
    public void canGoToWelcomePage() {
        welcomePage.goTo();
        String elementText = welcomePage.getTextElementById("welcome-title");
        Assertions.assertTrue(elementText.equals("Welcome to Grocery Store!"));
    }

    @Test
    public void canGoToProductListPage() {
        welcomePage.goTo();
        welcomePage.clickElementById("app-navbar-product-list");
        String elementText = productListPage.getTextElementById("product-list-save-button");
        Assertions.assertTrue(elementText.equalsIgnoreCase("Create"));
    }

    @Test
    public void canShowProductListTable() {
        productListPage.goTo();
        productListPage.clickElementById("product-list-get-button");
        String elementText = productListPage.getTextElementById("product-list-title");
        Assertions.assertTrue(elementText.equals("Product List"));
    }

    @Test
    public void hasProductListProducts() {
        productListPage.goTo();
        productListPage.clickElementById("product-list-get-button");
        Assertions.assertTrue(productListPage.findElementsByClass("mat-row").size() > 0);
    }

    @Test
    public void canDeleteProduct() {
        productListPage.goTo();
        productListPage.clickElementById("product-list-get-button");
        int numberOfProducts = productListPage.findElementsByClass("mat-row").size();
        int numberOfProductsAfterDelete;
        productListPage.clickElementById("product-list-delete-button-26");
        productListPage.clickElementById("product-list-get-button");
        numberOfProductsAfterDelete = productListPage.findElementsByClass("mat-row").size();
        Assertions.assertEquals(numberOfProductsAfterDelete, (numberOfProducts - 1));
    }

    @AfterAll
    public static void cleanUp() {
        BrowserGroceryStore.close();
    }

}
