package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestWebsite extends DriverSetup {

    @Test
    public void automateWebsite () throws InterruptedException {
        browser.get("https://eonbazar.com");
        Thread.sleep(2000);
        browser.manage().window().maximize();

        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());

        browser.findElement(By.cssSelector("span[class='sc-bczRLJ bcBtvx cursor-pointer'] svg path")).click();
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("span[class='sc-bczRLJ bcBtvx cursor-pointer'] svg path")).click();
        Thread.sleep(1000);

//        browser.findElement(By.xpath("//p[@class='text-white']")).click();
//        Thread.sleep(2000);
//
//        browser.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
//        Thread.sleep(2000);

        WebElement searchInput = browser.findElement(By.xpath("//label[@class='relative block']/input"));
        searchInput.sendKeys("chicken");
        Thread.sleep(3000);

        browser.navigate().refresh();
        Thread.sleep(1000);

        browser.findElement(By.linkText("Sign in")).click();
        Thread.sleep(2000);

        browser.navigate().back();
        Thread.sleep(2000);

//        browser.findElement(By.xpath("//*[name()='path' and contains(@d,'M456.8 120')]")).click();
//        Thread.sleep(2000);


        browser.findElement(By.id("headlessui-switch-6")).click();
        Thread.sleep(2000);
        browser.findElement(By.id("headlessui-switch-6")).click();
        Thread.sleep(2000);

        browser.findElement(By.xpath("//button[contains(@class, 'cat')]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//button[contains(@class, 'cat')]")).click();
        Thread.sleep(2000);


        List<WebElement> all_categories = browser.findElements(By.xpath("//ul[@class='grid grid-cols-10 gap-2 justify-between w-full']/li"));
        for (WebElement all_category:all_categories){
            all_category.click();
            Thread.sleep(2000);
        }

        //div[contains(@class,'swiper-slide mb-1')]//span

        browser.findElement(By.xpath("//img[@alt='Eonbazar Logo']")).click();
        Thread.sleep(2000);

        browser.manage().window().minimize();
        Thread.sleep(1000);

    }
}
