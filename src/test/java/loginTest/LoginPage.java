package loginTest;


import base.ScriptBase;
import controller.LoginPageController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends ScriptBase {

    LoginPageController loginPageController;
    @BeforeTest
    public void beforeTest(){
        init();
    }

    @Test
    public void verifyWebsiteOpen(){
        loginPageController=new LoginPageController(driver);
        loginPageController.signinButton(driver);
    }

      @Test
    public void verifyNewWebsiteOpen() {
       loginPageController = new LoginPageController(driver);
        loginPageController.logInTest();
    }

    @AfterTest
    public void afterTest(){
    driver.close();
    driver.quit();

        }

}

