package com.selenium.flipkart.test;

import com.selenium.flipkart.base.Base;
import com.selenium.flipkart.pages.CustomListener;
import com.selenium.flipkart.pages.Login;
import com.selenium.flipkart.pages.UserDashboard;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class FlipkartTest extends Base {
public static WebDriver driver;

    @Test
    public void loginApplication() throws InterruptedException {
        Login loginObj = new Login();
        loginObj.login();
    }
    UserDashboard userDashboard = new UserDashboard();
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
