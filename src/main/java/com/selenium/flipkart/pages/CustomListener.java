package com.selenium.flipkart.pages;

import com.selenium.flipkart.base.Base;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


public class CustomListener extends Base implements ITestListener {
    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED test");
        try {
            failed();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

}
