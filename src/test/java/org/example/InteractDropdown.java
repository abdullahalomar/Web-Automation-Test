package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InteractDropdown extends DriverSetup{

    @Test
    public void testDropdown() throws InterruptedException {
        browser.get("http://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement dropdown = browser.findElement(By.id("dropdown-class-example"));
        dropdown.click();

        Select select = new Select(dropdown);

        List<WebElement> options = select.getOptions();
        for (WebElement option:options){
            System.out.println(option.getText());
        }

        select.selectByVisibleText("Option3");
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("option2");
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(1);
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());
    }
}
