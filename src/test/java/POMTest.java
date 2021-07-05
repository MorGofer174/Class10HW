import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class POMTest {
    private static WebDriver driver;

    @BeforeClass
    public void runOnceBeforeClass() {  // opens chrome browser with URL
        driver = Singleton.getDriverInstance();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void printDimensions() {
        Calculator.getDimensions();
    }

    @Test
    public void checkDisplay() {
        Calculator.ifDisplayed();
    }

    @AfterClass // closes the browser
    public void close() {
        driver.quit();
    }

}
