package base;

import core.configuration.Configuration;
import core.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;
    public Configuration conf;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        conf = new Configuration("app.properties");
        driver = DriverFactory.getDriver(conf.getFilePath("browser"));
        driver.get("https://demoqa.com/");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
