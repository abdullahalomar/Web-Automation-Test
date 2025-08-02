package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleWebBrowser extends DriverSetup {

    @Test
    public void handleBrowser() throws InterruptedException {
        browser.get("https://othoba.com");
        Thread.sleep(2000);
        System.out.println(browser.getCurrentUrl());
        System.out.println(browser.getTitle());

        browser.navigate().to("https://github.com/"); // navigate to this url from previous url.
        Thread.sleep(2000);
        browser.navigate().back(); // back to previous url from current url

        browser.navigate().forward();
        Thread.sleep(2000);
//        browser.navigate().refresh();
//        Thread.sleep(2000);
//
//        browser.manage().window().maximize();
//        Thread.sleep(2000);
//        browser.manage().window().fullscreen();
//        Thread.sleep(2000);
//        browser.manage().window().minimize();
//        Thread.sleep(2000);
//        browser.manage().window().maximize();
//        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.TAB); // open a new tab in existing browser
        Thread.sleep(2000);
        browser.get("https://openai.com");
        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.WINDOW); // open a new browser window
        Thread.sleep(2000);
        browser.get("https://gemini.google.com");
        Thread.sleep(2000);

        String getCurrentWindowHandleKey = browser.getWindowHandle();
        System.out.println(getCurrentWindowHandleKey);

        browser.switchTo().newWindow(WindowType.TAB);
        browser.navigate().to("https://github.com/");
        Thread.sleep(2000);

        browser.switchTo().window(getCurrentWindowHandleKey);
        Thread.sleep(2000);

        List<String> handles =  new ArrayList<String>(browser.getWindowHandles()) ;

        for (String handle:handles){
            browser.switchTo().window(handle);
            System.out.println(handle);
            System.out.println("Currently in " + browser.getTitle() + "Page");
            Thread.sleep(2000);
        }
    }

}
