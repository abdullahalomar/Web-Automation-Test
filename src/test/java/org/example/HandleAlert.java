package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleAlert extends DriverSetup{

    @Test
    public void testAlert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");

        browser.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
        Alert alert = browser.switchTo().alert();

        String alertText = alert.getText();
        System.out.println(alertText);
        Thread.sleep(2000);

        alert.accept();
        Thread.sleep(2000);


        browser.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        alertText = alert.getText();
        System.out.println(alertText);

        alert.dismiss();
        Thread.sleep(2000);


        browser.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
        alert.sendKeys("Hello");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
    }
}
