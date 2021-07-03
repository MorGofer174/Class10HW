import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Waitings {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\morg\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");

    }

    @Test (priority = 1)
    public void removeCheckbox (){
    driver.findElement(By.id("btn")).click();
    driver.findElement(By.id("message"));
    }

    @Test (priority = 2)
    public void showHidden () throws InterruptedException {
        driver.findElement(By.id("hidden")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("finish1"));
    }

    @Test (priority = 3)
    public void render (){
        driver.findElement(By.id("rendered")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("finish2")));
    }
    @AfterClass
    public void close(){
        driver.quit();
    }
}




