package com.qa.test;
import org.openqa.selenium.By;

public class home extends base {

        public home() {
            super();
        }

        public void open() {
            driver.get("https://staging.a-d.com.au/new-apartments-developments/vic/moonee-ponds-3039/thomas-street");
        }

        public formPage navigateToFormPage() {
            driver.findElement(By.xpath("//*[@id=\"main\"]/content/apd-showcase/main/section[3]/div/apd-button-default/button/span[1]")).click(); // Example navigation link
            return new formPage(driver);
        }
    }


