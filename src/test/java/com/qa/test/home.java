package com.qa.test;
import org.openqa.selenium.By;

public class home extends base {

        public home() {
            super(driver);
        }

        public void open() {
            driver.get("https://staging.a-d.com.au/new-apartments-developments/vic/moonee-ponds-3039/thomas-street");
        }

        public formPage navigateToFormPage() {
            driver.findElement(By.linkText("Form")).click(); // Example navigation link
            return new formPage(driver);
        }
    }


