package core.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    public static WebDriver getDriver(String browser){
        switch (browser){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "ie":
                WebDriverManager.firefoxdriver().setup();
                return new InternetExplorerDriver();
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions ops = new ChromeOptions();
//                ops.addArguments("--incognito");
                ops.addArguments("--start-maximized");
                ops.addArguments("--force-device-scale-factor=0.8");
           //     ops.addArguments("--window-size=1000,1080");
                return new ChromeDriver(ops);
        }
    }
}
