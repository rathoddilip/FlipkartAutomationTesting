package com.selenium.flipkart.pages;

import com.selenium.flipkart.base.Base;
import org.openqa.selenium.By;

public class Login extends Base {
    public void login() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7756994045");
        driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("30Login@123");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();


    }
}
