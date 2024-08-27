package core.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebActionKeywords {
    public WebDriver driver;
    public WebDriverWait wait;
    public WebActionKeywords(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
    }

    public void openUrl(String url) throws Exception {
        if(!(url.startsWith("http://")||  url.startsWith("https://"))){
            throw new Exception("Invalid Url format, you have to protocal http or https");
        }
        this.driver.get(url);
    }

    public WebElement findElement(By locator) {
        return (WebElement) this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public void setText(By locator, String text) {
        WebElement element = this.findElement(locator);
        try{
            element.clear();
            element.sendKeys(text);
        }catch (WebDriverException e){
            throw new WebDriverException("Element is not able to set text");
        }
    }
    public String getText(By elementLocator){
        WebElement element = this.findElement(elementLocator);
        return element.getText();
    }

    public void click(By elementLocator){
        WebElement element = this.findElement(elementLocator);
    //    wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions action = new Actions(this.driver);
        action.moveToElement(element).build().perform();
        element.click();
    }
    public void select(WebElement element, SelectType type, String options) throws Exception {
        Select select = new Select(element);
        switch (type){
            case SELECT_BY_INDEX:
                try{
                    select.selectByIndex(Integer.parseInt(options));
                }catch (Exception e){
                    throw new Exception("You need to add an input number on select options for selectType.SELECT_BY_INDEX");
                }
                break;
            case SELECT_BY_TEXT:
                select.selectByVisibleText(options);
                break;
            case SELECT_BY_VALUE:
                select.selectByValue(options);
                break;
            default:
                throw  new Exception("Get error in using selected");
        }

    }

    public enum SelectType{
        SELECT_BY_INDEX,
        SELECT_BY_TEXT,
        SELECT_BY_VALUE
    }
}
