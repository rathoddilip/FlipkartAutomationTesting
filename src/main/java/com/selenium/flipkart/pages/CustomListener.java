package com.selenium.flipkart.pages;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomListener extends ScreenshotClass implements ITestListener {
    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED Test");
        try {
            failed(result.getMethod().getMethodName());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("SUCCESS Test");
        success(result.getMethod().getMethodName());
    }

}
