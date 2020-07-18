package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageController {


@FindBy(xpath = "//*[@id='contact-link']/a")
    WebElement contactUsTab;

    public HomePageController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


public void contactUsButtonDisplayed(){

    contactUsTab.isDisplayed();
}





}
