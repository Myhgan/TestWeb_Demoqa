package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pannel {
    public WebDriver _driver;
    public Pannel(WebDriver driver){
        this._driver = driver;
    }
    public void item(int item){
        String btnItemCss = String.format("#item-%d", item);
        this._driver.findElement(By.cssSelector(btnItemCss)).click();
    }

}
