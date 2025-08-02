package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends DriverSetup {

    @Test
    public void testPageTitle() {

        browser.get("https://eonbazar.com/");

        String pageTitle = browser.getTitle();

        Assert.assertEquals(pageTitle, "Buy Safe Healthy and Organic Foods Online in BD - EonBazar.com");

    }

    @Test
    public void testPageUrl() {

        browser.get("https://eonbazar.com/");

        String pageUrl = browser.getCurrentUrl();

        Assert.assertEquals(pageUrl, "https://eonbazar.com/");

    }
}
