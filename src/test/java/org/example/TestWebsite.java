package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestWebsite extends DriverSetup {

    @Test
    public void automateWebsite () throws InterruptedException {
        browser.get("https://eonbazar.com");
        Thread.sleep(2000);

        browser.findElement(By.cssSelector("text-white.text-sm")).click();
        Thread.sleep(2000);

    }
}
