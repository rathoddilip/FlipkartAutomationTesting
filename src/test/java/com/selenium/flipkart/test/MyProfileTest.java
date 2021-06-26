package com.selenium.flipkart.test;

import com.selenium.flipkart.base.Base;
import com.selenium.flipkart.pages.MyProfile;
import org.testng.annotations.Test;

public class MyProfileTest extends Base {
    MyProfile myProfile= new MyProfile();
    @Test
    public void userprofileTest()
    {
        myProfile.userProfile();
    }

}
