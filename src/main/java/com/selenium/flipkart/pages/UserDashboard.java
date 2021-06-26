package com.selenium.flipkart.pages;

import com.selenium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserDashboard extends Base {
    public void searchProduct() throws InterruptedException {

        Thread.sleep(400);
        // identify element
        WebElement searchElement = driver.findElement(By.name("q"));
        searchElement.sendKeys("mobiles");
        // type enter with sendKeys method and pass Keys.ENTER
        searchElement.sendKeys(Keys.ENTER);
        System.out.println("in search Url validation");
        String expectedUrl = "https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off";
        System.out.println(driver.getCurrentUrl());
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Validate the search url");

    }

    public void selectProduct() throws InterruptedException {
        Thread.sleep(400);
        driver.findElement(By.xpath("(//div[contains(concat(\" \", normalize-space(@class), \" \"), \"_4rR01T\")])[1]")).click();
    }

    public void addProductToCart() throws InterruptedException {
        Thread.sleep(400);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,100)");
        driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
    }

}
