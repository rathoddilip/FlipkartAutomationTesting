package com.selenium.flipkart.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class Base {
    public static WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current url: " + driver.getCurrentUrl());
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    public void failed() throws IOException {
        File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcfile, new File("D:\\Selenium\\AutomationTestingProject\\src\\main\\java\\com\\selenium\\flipkart\\failed\\testfailure.jpg"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
