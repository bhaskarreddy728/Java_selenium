package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByClass extends BaseClass {
    @Test
    public void byclass() {
        driver.get("https://www.google.com//");
        driver.findElement(By.className("gLFyf")).sendKeys("Rx 100 bike pics", Keys.ENTER);

    }
}

