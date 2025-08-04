package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateWebElement extends DriverSetup {

    @Test
    public void testLocalElement() throws InterruptedException {
        browser.get("https://eonbazar.com");
        WebElement searchInput;

//        searchInput = browser.findElement(By.id("q"));
//        searchInput = browser.findElement(By.name("q"));

//        searchInput = browser.findElement(By.className("aa-Input"));
//          searchInput = browser.findElement(By.tagName("input"));
//        searchInput = browser.findElement(By.cssSelector("input[placeholder='Search for products (e.g. chicken, paratha, milk)']"));
//        searchInput = browser.findElement(By.xpath("//input[@name='q']"));

        // custom selector
//        searchInput = browser.findElement(By.cssSelector("input"));
//        searchInput = browser.findElement(By.xpath("//input"));
//        searchInput = browser.findElement(By.cssSelector("#q"));
//        searchInput = browser.findElement(By.cssSelector(".className"));
//        searchInput = browser.findElement(By.cssSelector("[name='q']"));
//        searchInput = browser.findElement(By.xpath("//*[@name='q']"));
        searchInput = browser.findElement(By.cssSelector("label[class=\"relative block\"]>input"));
//        searchInput = browser.findElement(By.xpath("//label[@class=\"relative block\"]/input"));
        searchInput.sendKeys("chicken");

        Thread.sleep(5000);

//        browser.findElement(By.linkText("Sign in")).click();
//        Thread.sleep(3000);
//
//        browser.navigate().back();
//
//        browser.findElement(By.id("headlessui-switch-6")).click();
//        Thread.sleep(5000);

    }
}

// continue with time: 01:03:26