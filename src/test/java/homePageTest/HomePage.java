package homePageTest;

import base.ScriptBase;
import controller.HomePageController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HomePage extends ScriptBase {
    HomePageController homePageController;

    @Test
    public void verifyContactUsButtonDisplayed(){

        homePageController=new HomePageController(driver);

        homePageController.contactUsButtonDisplayed();
    }

    @AfterTest
    public void afterTest(){
        //driver.close();
        driver.quit();

    }

}
