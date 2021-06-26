package com.selenium.flipkart.pages;

import com.selenium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.WatchEvent;

public class MyProfile extends Base {
    public void userProfile() {
        WebElement loginButtonParentElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(loginButtonParentElement).perform();
        driver.findElement(By.xpath("//div[@class='_vhnxf']")).click();
    }
}
