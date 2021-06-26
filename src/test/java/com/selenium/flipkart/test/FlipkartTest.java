package com.selenium.flipkart.test;

import com.selenium.flipkart.base.Base;
import com.selenium.flipkart.pages.Login;
import com.selenium.flipkart.pages.UserDashboard;
import org.testng.annotations.Test;

public class FlipkartTest extends Base {
    UserDashboard userDashboard = new UserDashboard();


    @Test
    public void loginApplication() throws InterruptedException {
        Login loginObj = new Login(driver);
        loginObj.login();
    }

    @Test
    public void searchProductTest() throws InterruptedException {
        userDashboard.searchProduct();
    }

    @Test
    public void selectedProductTest() throws InterruptedException {
        userDashboard.selectProduct();
    }

    @Test
    public void addToCartTest() throws InterruptedException {
        userDashboard.addProductToCart();

    }


}
