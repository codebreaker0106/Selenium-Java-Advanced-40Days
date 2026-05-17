import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager extends BaseConfig {
    public static WebDriver validateBrowser(String browser, int timeout) {
        if (browser.equalsIgnoreCase("Chrome")) {
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            return new FirefoxDriver();
        } else {
            System.out.println("Unsupported Browser");
            return null;
        }
    }
}