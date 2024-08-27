package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
        this.uri = "buttons";
    }
    private By btnDoubleClick = By.cssSelector("#doubleClickBtn");
    private By btnRightClick = By.cssSelector("#rightClickBtn");
    private By btnClick = By.xpath("//button[text()='Click Me']");

    private By lblDoubleClick = By.cssSelector("#doubleClickMessage");
    private By lblRightClick = By.cssSelector("#rightClickMessage");
    private By lblClick = By.cssSelector("#dynamicClickMessage");

    public WebElement getDoubleClick(){

        return this.actionKeywords.findElement(btnDoubleClick);
    }
    public WebElement getRightClick(){
        return this.actionKeywords.findElement(btnRightClick);
    }
    public WebElement getClick(){
        return this.actionKeywords.findElement(btnClick);
    }

    public void clickClMe(){
        this.actionKeywords.click(btnClick);
    }
    public void clickDoubleClick(){
        Actions act = new Actions(_driver);
        act.doubleClick(getDoubleClick()).perform();
    }
    public void clickRightClick(){
        Actions act = new Actions(_driver);
        act.contextClick(getRightClick()).perform();
    }

//    public void  validateInput(){
//        SoftAssert softAssert = new SoftAssert();
//
//        softAssert.assertEquals(lblDoubleClick, "You have done a double click", "mismatch");
//        softAssert.assertEquals(lblRightClick, "You have done a right click", "mismatch");
//        softAssert.assertEquals(lblClick, "You have done a dynamic click", "mismatch");
//    }
}
