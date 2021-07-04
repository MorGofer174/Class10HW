import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class POMTest {
    public static WebDriver driver;

    @BeforeClass
    public void runOnceBeforeClass() {  // opens chrome browser with URL
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\morg\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test(priority = 1)
    public void printDimensions() {
        Calculator.getDimensions();
    }

    @Test(priority = 2)
    public void checkDisplay() {
        Calculator.ifDisplayed();
    }


    @AfterClass
    public void close() {  // closes the browser
        driver.quit();
    }
}