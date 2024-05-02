package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class home extends base {

    public home() {
        super();
    }

    public void open() {
        driver.manage().window().maximize();
        driver.get("https://staging.a-d.com.au/new-apartments-developments/vic/moonee-ponds-3039/thomas-street");

    }

    public void openFormModal() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(By.className("mat-button-wrapper"))).click();
    }

    public void fillForm(String name, String email) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        WebElement name_in = driver.findElement(By.id("mat-input-7"));
        name_in.click();
        name_in.sendKeys(name);
        WebElement mail_in = driver.findElement(By.id("mat-input-8"));
        mail_in.click();
        mail_in.sendKeys(email);


    }

    public void createRandomContactNumber() {
        Random random = new Random();
        String randomDigit = "4";
        for (int i = 1; i <= 8; i++) {
            randomDigit += random.nextInt(10);
        }

        WebElement mob = driver.findElement(By.id("phone"));
        mob.click();
        mob.sendKeys(randomDigit);

    }

    public void checkCheckboxesRandomly() {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        Random random = new Random();
        for (WebElement checkbox : checkboxes) {
            checkbox.click(); // Select/deselect randomly
        }
    }

    public void postCode() {
        WebElement post_code = driver.findElement(By.id("mat-input-9"));
        post_code.click();
        post_code.sendKeys("3000");
    }

    public void submitForm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(By.className("enquiry-submit"))).click();
        //driver.findElement(By.className("enquiry-submit")).click();
    }

    public void processFormSubmission() {
        createRandomContactNumber();
postCode();
        String[] dropdownIds = {"mat-input-12", "mat-input-15", "mat-input-13", "mat-input-10", "mat-input-14"};
        Random random = new Random();
        for (String dropdownId : dropdownIds) {
            WebElement dropdown = driver.findElement(By.id(dropdownId));
            Select select = new Select(dropdown);
            List<WebElement> options = select.getOptions();
            int randomIndex = random.nextInt(options.size());
            select.selectByIndex(randomIndex);
        }

        checkCheckboxesRandomly();

        // Submit the form
        submitForm();
    }
}


