package com.automation;
import org.testng.annotations.Test;
import com.automation.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void verifyGoogleLaunch() {
        System.out.println("Google page title: " + driver.getTitle());
    }
}