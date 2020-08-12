package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageController {

    @FindBy(xpath = "//a[@class='login']") WebElement SignInTab;
    @FindBy(name = "email") WebElement imputEmail;
    @FindBy(id = "passwd") WebElement ipmutpasswd;
    @FindBy(css = "#SubmitLogin > span") WebElement logInButton;

public LoginPageController(WebDriver driver){
    PageFactory.initElements(driver,this);

}
    public void signinButton(WebDriver driver){
        //WebElement element= driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        //  System.out.println(element);
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
    }
    public void logInTest() throws InterruptedException {
    SignInTab.click();
    Thread.sleep(1000);
    imputEmail.sendKeys("foyezali@gmail.com");
    ipmutpasswd.sendKeys("12345xyz");
    logInButton.click();


    }

}
