package com.selenium.flipkart.pages;

import com.selenium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
    WebDriver driver;
    @FindBy(xpath = "//input[@class='_2IX_2- VJZDxU'])")
    WebElement username;
    @FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
    WebElement password;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
    WebElement login;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() throws InterruptedException {
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7756994045");
//        driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("30Login@123");
//        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        username.sendKeys("7756994045");
        password.sendKeys("30Login@123");
        login.click();


    }
}
