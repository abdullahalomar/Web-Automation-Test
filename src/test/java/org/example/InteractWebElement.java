package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWebElement extends DriverSetup {

    @Test
    public void interactElement() throws InterruptedException {
        browser.get("http://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement h1 = browser.findElement(By.tagName("h1"));
        String first_heading_text = h1.getText();

        System.out.println(first_heading_text);

        WebElement radio_button_1 = browser.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("Display :" + radio_button_1.isDisplayed());
        System.out.println("Before click Select :" + radio_button_1.isSelected());
        Thread.sleep(2000);
        radio_button_1.click();
        System.out.println("After click select :" + radio_button_1.isSelected());
        Thread.sleep(2000);

        WebElement radio_button_2 = browser.findElement(By.xpath("//input[@value='radio2']"));
        System.out.println("Before click Select :" + radio_button_2.isSelected());
        Thread.sleep(2000);
        radio_button_2.click();
        System.out.println("After click select :" + radio_button_2.isSelected());
        Thread.sleep(2000);

        WebElement input_box = browser.findElement(By.xpath("//input[@id='autocomplete']"));
        input_box.sendKeys("Country");
        Thread.sleep(2000);
        input_box.clear();
        Thread.sleep(2000);
        input_box.sendKeys("State");
        Thread.sleep(2000);
        input_box.clear();
        Thread.sleep(2000);

        String attribute = input_box.getAttribute("placeholder");
        System.out.println("Attribute is: " + attribute);

        WebElement open_window = browser.findElement(By.id("openwindow"));
        String bg_color = open_window.getCssValue("background-color");
        System.out.println(bg_color);
    }
}
