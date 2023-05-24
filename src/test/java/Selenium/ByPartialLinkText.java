package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByPartialLinkText extends BaseClass {
    @Test
    public void bypartial() throws InterruptedException {
        driver.get("https://www.google.com//");
        driver.findElement(By.partialLinkText("Imag")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Rx 100 bike pics", Keys.ENTER);
    }
}
