package homePageTest;

import base.ScriptBase;
import controller.HomePageController;
import org.testng.annotations.Test;

public class HomePage extends ScriptBase {
    HomePageController homePageController;

    @Test
    public void verifyContactUsButtonDisplayed(){
   init();
        homePageController=new HomePageController(driver);

        homePageController.contactUsButtonDisplayed();
    }


}
