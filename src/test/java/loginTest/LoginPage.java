package loginTest;


import base.ScriptBase;
import controller.LoginPageController;
import org.openqa.selenium.By;
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
    public void verifyLoginWithTestAccount() throws InterruptedException {
       loginPageController = new LoginPageController(driver);
        loginPageController.logInTest();
        loginPageController.inPutEmailOrPasswd(driver,"email","Test@gmail.com");
        loginPageController.inPutEmailOrPasswd(driver,"passwd","1234");
        loginPageController.loginButton();
    }
    @Test
    public void verifyInformationDesk(){
        loginPageController=new LoginPageController(driver);

    }
    @Test
    public void verifyLoginWithDifferintUser() throws InterruptedException {
        loginPageController = new LoginPageController(driver);
        loginPageController.logInTest();
        loginPageController.inPutEmailOrPasswd(driver,"email","nasir@gmail.com");
        loginPageController.inPutEmailOrPasswd(driver,"passwd","12345");
        loginPageController.loginButton();
    }
    @AfterTest
    public void afterTest(){
    driver.close();
    driver.quit();

        }

}

