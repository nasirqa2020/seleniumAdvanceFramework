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
    public void verifyInformationMyOrderDisplayed() throws InterruptedException {
        loginPageController=new LoginPageController(driver);
        Thread.sleep(500);
        loginPageController.verifyInformationdesk(driver,"My orders");

    }
    @Test
    public void verifyLoginWithDifferintUser() throws InterruptedException {
        loginPageController = new LoginPageController(driver);
        loginPageController.logInTest();
        loginPageController.inPutEmailOrPasswd(driver,"email","nasir@gmail.com");
        loginPageController.inPutEmailOrPasswd(driver,"passwd","12345");
        loginPageController.loginButton();
    }

    @Test
    public void verifyInformationTitleSpecial(){
        loginPageController=new LoginPageController(driver);
       // loginPageController
    }
    @Test
    public void verifyInformationMycreditslipsDisplayed() throws InterruptedException {
        loginPageController=new LoginPageController(driver);
        Thread.sleep(500);
        loginPageController.verifyInformationdesk(driver,"My credit slips");

    }
    @Test
    public void verifyInformationMyaddressesDisplayed() throws InterruptedException {
        loginPageController=new LoginPageController(driver);
        Thread.sleep(500);
        loginPageController.verifyInformationdesk(driver,"My addresses");
    }
    @Test
    public void verifyInformationMypersonalinfoDisplayed() throws InterruptedException {
        loginPageController=new LoginPageController(driver);
        Thread.sleep(500);
        loginPageController.verifyInformationdesk(driver,"My personal info");
    }

    @AfterTest
    public void afterTest(){
    driver.close();
    driver.quit();

        }

}

