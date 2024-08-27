package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage extends BasePage {

    public CheckboxPage(WebDriver driver) {
        super(driver);
        this.uri = "checkbox";
    }
    private By btnShowDetails = By.xpath("//*[@id=\"tree-node\"]/div/button[1]");
    private By lblAgular = By.xpath("//span[contains(text(), 'Angular')]");
    private By lblReact = By.xpath("//span[contains(text(), 'React')]");
    private By lblVeu = By.xpath("//label[@for='tree-node-veu']");

    public void showDetails(){
        this.actionKeywords.click(btnShowDetails);
    }
    public void checkAgular(){
        this.actionKeywords.click(lblAgular);
    }
    public void checkReact(){
        this.actionKeywords.click(lblReact);
    }
    public void checkVeu(){
        this.actionKeywords.click(lblVeu);
    }
}
