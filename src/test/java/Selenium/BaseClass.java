package Selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    protected WebDriver driver;
    String browser = "Chrome";

    @BeforeClass
    public void Setup() {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("disable notification");
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(ops);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }


    @AfterClass
    public void Teardown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
