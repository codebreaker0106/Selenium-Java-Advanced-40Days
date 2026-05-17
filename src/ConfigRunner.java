import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ConfigRunner extends BaseConfig {

    public static void main(String[] args) {
        String[] browserList = {"Chrome", "Firefox", "Safari"};
        for (String browser : browserList) {
            WebDriver driver = BrowserManager.validateBrowser(browser, timeout);
            if (driver != null) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                driver.get("https://www.google.com");
                driver.quit();
            }
        }
    }
}