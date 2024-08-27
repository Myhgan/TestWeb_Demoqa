package test;

import base.TestBase;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends TestBase {
    @Test
    public void verifyAngularCheckbox(){
        CheckboxPage checkboxPage = new CheckboxPage(this.driver);
        checkboxPage.navigate();
        checkboxPage.showDetails();
        checkboxPage.checkAgular();
    }

    @Test
    public  void rerifyIconCheckbox(){
        CheckboxPage checkboxPage = new CheckboxPage(this.driver);
        checkboxPage.navigate();
        checkboxPage.showDetails();
        checkboxPage.checkReact();
        checkboxPage.checkAgular();
        checkboxPage.checkVeu();
    }
}
