package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageController {

    @FindBy(xpath = "//a[@class='login']") WebElement SignInTab;
    @FindBy(css="span.navigation_page") WebElement authTab;
    @FindBy(name = "email") WebElement imputEmail;
    @FindBy(id = "passwd") WebElement ipmutpasswd;
    @FindBy(css = "#SubmitLogin > span") WebElement logInButton;
    @FindBy(xpath = "//a[@title='My orders']") WebElement endPageInfo;

public LoginPageController(WebDriver driver){
    PageFactory.initElements(driver,this);

}
    public void signinButton(WebDriver driver){
        //WebElement element= driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        //  System.out.println(element);
        driver.findElement(By.cssSelector(" a.login")).click();

    }



    public void logInTest() throws InterruptedException {
    SignInTab.click();
    Thread.sleep(1000);
    authTab.isDisplayed();
        Assert.assertEquals(authTab,authTab);
//Assert.assertEquals(authTab,true    );
  //  imputEmail.sendKeys("foyezali@gmail.com");
   // ipmutpasswd.sendKeys("12345xyz");
   //logInButton.click();

    }
    public void inPutEmailOrPasswd(WebDriver driver,String inputEmailOrPasswd,String emailOrPasswd){
    driver.findElement(By.name(""+inputEmailOrPasswd+"")).sendKeys(emailOrPasswd);

    }
    public void loginButton(){
        logInButton.click();
    }
    public void verifyInformationdesk(WebDriver driver,String endPageInfo){
    driver.findElement(By.xpath("//a[@title='"+endPageInfo+"']")).isDisplayed();

    }

    }
