package test;

import base.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ButtonsPage;

public class ButtonsTest extends TestBase {
    @Test
    public void checkDisplayWhenClickingDoubleClick(){
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.navigate();
        buttonsPage.clickDoubleClick();
    }

    @Test
    public void checkDisplayWhenClickingRightClick(){
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.navigate();
        buttonsPage.clickRightClick();
    }
    @Test
    public void checkDisplayWhenClickingBtnClick(){
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.navigate();
        buttonsPage.clickClMe();
    }

    @Test
    public void checkDisplayWhenClickAll(){
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.navigate();
        buttonsPage.clickRightClick();
        buttonsPage.clickDoubleClick();
        buttonsPage.clickClMe();

        // Validate
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }
}
