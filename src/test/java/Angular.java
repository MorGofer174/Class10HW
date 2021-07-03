import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Angular {

    private static WebDriver driver;
    private static WebElement myName;

    @BeforeClass
    public void runOnceBeforeClass() {  // opens chrome browser with URL
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\morg\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
     //   NgWebDriver ngWebDriver = new NgWebDriver((JavascriptExecutor) driver);
        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
    }

    @Test
    public void firstNameChange (){  // changes the first name and assert
        driver.findElement(ByAngular.model("firstName")).clear();
        driver.findElement(ByAngular.model("firstName")).sendKeys("Mor");
        myName = driver.findElement(ByAngular.model("firstName"));
        Assert.assertEquals(driver.findElement(ByAngular.model("firstName")),myName);
    }

    @AfterClass
    public void close(){ // closes the browser
        driver.quit();
    }

}
