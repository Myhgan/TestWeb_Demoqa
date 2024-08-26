package base;

import core.keywords.WebActionKeywords;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.components.Pannel;

public class BasePage {
    protected WebDriver _driver;
    protected Pannel pannel;
    protected WebActionKeywords actionKeywords;
    protected String base_url;
    protected String uri;
    protected WebDriverWait _wait;

    public BasePage(WebDriver driver) {
        this._driver = driver;
        this.pannel = new Pannel(_driver);
        this.actionKeywords = new WebActionKeywords(this._driver);
        this.base_url = "https://demoqa.com/";
        this.uri = "";
    }

    public Pannel getPannel() {
        return this.pannel;
    }

    public void navigate(){
        this._driver.get(this.base_url+this.uri);
    }

}
