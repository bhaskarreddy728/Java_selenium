package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends BaseClass{
    @Test
    public void byname(){
        driver.get("https://www.google.com//");
        driver.findElement(By.name("q")).sendKeys("Rx 100 bike pics", Keys.ENTER);

    }

}
