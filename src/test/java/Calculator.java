import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calculator {

    private static WebDriver driver = Singleton.getDriverInstance();
    private static int num = 17;

    public static void getDimensions(){
        WebElement dimensions = driver.findElement(Constants.id7);
        System.out.println(dimensions.getRect());
}
    public static void ifDisplayed(){
        WebElement Display = driver.findElement(Constants.id6);
        System.out.println(Display.isDisplayed());
    }
}
