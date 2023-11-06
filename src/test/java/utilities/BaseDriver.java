package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Dictionary;

public class BaseDriver {

    public static WebDriver driver;

    public BaseDriver() {
        driver = StartBrowser();
    }

    private WebDriver StartBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }

    public void Quit(){
        driver.quit();
    }

    public void Click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void SendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }
}
