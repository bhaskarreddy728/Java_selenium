package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ById extends BaseClass  {
    @Test
    public void byid(){
        driver.get("https://www.google.com//");
driver.findElement(By.id("APjFqb")).sendKeys("Rx 100 bike pics", Keys.ENTER);

    }

}
