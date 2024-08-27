package data;

import core.helper.JSONHelper;
import org.testng.annotations.DataProvider;

public class TextboxData {
    @DataProvider(name = "informationTextbox")
    public Object[][] dataFromJson() {
        return JSONHelper.readJsonFromFile("src/test/java/data/driven/information-textbox.json");
    }

    @DataProvider(name = "statusData")
    public Object[][] dataStatusJson() {
        return JSONHelper.readJsonFromFile("src/test/java/data/driven/status-data.json");
    }
    @DataProvider(name = "registrationData")
    public Object[][] dataRegistrationJson(){
        return JSONHelper.readJsonFromFile("src/test/java/data/driven/registration-data.json");
    }
    @DataProvider(name = "studentData")
    public Object[][] dataStudentJson(){
        return JSONHelper.readJsonFromFile("src/test/java/data/driven/students-data.json");
    }
}
