package com.selenium.flipkart.pages;

import com.selenium.flipkart.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ScreenshotClass extends Base {
    public File sourceFile;
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    public void failed(String testMethodName) throws IOException {
        sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("D:\\Selenium\\AutomationTestingProject\\src\\main\\java\\com\\selenium\\flipkart\\failed\\TestFailed" + "_" + testMethodName +timeStamp+".jpg"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void success(String testMethodName) {
        sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("D:\\Selenium\\AutomationTestingProject\\src\\main\\java\\com\\selenium\\flipkart\\success\\TestSuccess" + "_" + testMethodName +timeStamp+ ".jpg"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
