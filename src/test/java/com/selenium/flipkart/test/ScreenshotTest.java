package com.selenium.flipkart.test;

import com.selenium.flipkart.base.Base;
import com.selenium.flipkart.pages.ScreenShotPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScreenshotTest extends ScreenShotPage {
    ScreenShotPage screenShotPage=new ScreenShotPage();
    @Test
   public void takescreenshotTest() throws IOException {
       screenShotPage.screenshot("D://TestingMaterial//FlipkartScreenshot//test1.png");
   }
}
