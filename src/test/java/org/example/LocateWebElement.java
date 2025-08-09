package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocateWebElement extends DriverSetup {

    @Test
    public void testLocalElement() throws InterruptedException {
        browser.get("https://meenabazaronline.com/");
        WebElement searchInput;

//        searchInput = browser.findElement(By.id("q"));
//        searchInput = browser.findElement(By.name("q"));

//        searchInput = browser.findElement(By.className("aa-Input"));
//          searchInput = browser.findElement(By.tagName("input"));
//        searchInput = browser.findElement(By.xpath("//input[@name='q']"));

        // custom selector
//        searchInput = browser.findElement(By.cssSelector("input"));
//        searchInput = browser.findElement(By.xpath("//input"));
//        searchInput = browser.findElement(By.cssSelector("#q"));
//        searchInput = browser.findElement(By.cssSelector(".className"));
//        searchInput = browser.findElement(By.cssSelector("[name='q']"));
//        searchInput = browser.findElement(By.xpath("//*[@name='q']"));
        // Multiple attribute
//        input[id="q"][name="q"] -> css selector
          //input[@id="q" and @name="q"] -> xpath

        //If Dynamically change the attribute value
          //input[contains(id,"q")]
          //input[stars-with(id,"q")]
          //input[ends-with(id,"q")]

        // Find with text XPath
           //*[text()="Sign in"]
           //*[contains(text(),"Sign in")] -> concat text and contains
           //a[contains(text(),"Sign in")] -> with specific tag

        // Find element with indexing
           //ul[@class="grid grid-cols-10 gap-2 justify-between w-full"]/li[4]
           //ul[@class="grid grid-cols-10 gap-2 justify-between w-full"]/li[last()] -> don't know amount's element
        // with css selector
           // ul[class="grid grid-cols-10 gap-2 justify-between w-full"] > li:first-child
           // ul[class="grid grid-cols-10 gap-2 justify-between w-full"] > li:nth-child(4)

        /* Detect sibling elements
           এখানে 4 নাম্বার li এর অপরে যতগুলো li আছে সেগুলো detect করবে।
           //ul[@class="grid grid-cols-10 gap-2 justify-between w-full"]/li[4] /preceding-sibling::li

           এখানে 4 নাম্বার li এর নিচে যতগুলো li আছে সেগুলো detect করবে।
           //ul[@class="grid grid-cols-10 gap-2 justify-between w-full"]/li[4] /following-sibling::li

           এখানে যে sibling element কে ধরা আছে তার parent element/tag কে detect করবে যেটা বলে দেওয়া হবে।
           //ul[@class="grid grid-cols-10 gap-2 justify-between w-full"]/parent::div
         */

//        searchInput = browser.findElement(By.cssSelector("label[class='relative block']>input"));
        searchInput = browser.findElement(By.xpath("(//input[@placeholder='Search by products brand or name'])[2]"));
        searchInput.sendKeys("chicken");

        Thread.sleep(5000);

//        browser.findElement(By.linkText("Sign in")).click();
//        Thread.sleep(3000);
//
//        browser.navigate().back();
//
//        browser.findElement(By.id("headlessui-switch-6")).click();
//        Thread.sleep(5000);

//        List<WebElement> all_links = browser.findElements(By.xpath("//a"));
//        for (WebElement all_link: all_links){
//            String text = all_link.getText();
//            System.out.println(text);
//        }

    }
}

