package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class formPage extends base {
    public formPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String name, String email, String message) {
        driver.findElement(By.id("mat-input-7")).sendKeys(name);
        driver.findElement(By.id("mat-input-8")).sendKeys(email);

        new Select(driver.findElement(By.id("mat-input-12"))).selectByVisibleText("Option 1");
        new Select(driver.findElement(By.id("mat-input-15"))).selectByVisibleText("Option 2");
        new Select(driver.findElement(By.id("mat-input-13"))).selectByVisibleText("Option 3");
        new Select(driver.findElement(By.id("mat-input-10"))).selectByVisibleText("Option 4");
        new Select(driver.findElement(By.id("mat-input-14"))).selectByVisibleText("Option 5");

        driver.findElement(By.id("message")).sendKeys(message);
    }

    public void submitForm() {
        driver.findElement(By.className("enquiry-submit")).click();
    }
}
