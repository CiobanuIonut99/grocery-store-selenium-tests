package com.grocery;

public class PagesGroceryStore {
    public static WelcomePage instantiateWelcomePage() {
        WelcomePage welcomePage = new WelcomePage();
        return welcomePage;
    }
    public static ProductListPage instantiateProductListPage() {
        ProductListPage productListPage = new ProductListPage();
        return productListPage;
    }

}
