package loginTest;


import base.ScriptBase;
import controller.LoginPageController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPage extends ScriptBase {

LoginPageController loginPageController;

    @Test
    public void verifyWebsiteOpen(){
        init();
        loginPageController=new LoginPageController(driver);


   loginPageController.signinButton(driver);
   loginPageController.logIn();
}
    @Test
    public void verifyWebsiteOpen2(){
        loginPageController=new LoginPageController(driver);
        init();

        loginPageController.signinButton(driver);
    }

    @AfterTest
    public void afterTest(){
    driver.close();
    driver.quit();

        }

}

