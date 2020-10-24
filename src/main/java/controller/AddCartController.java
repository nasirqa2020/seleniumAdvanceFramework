package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartController {
    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement addCartLink;
    @FindBy(id="cart_title") WebElement addSummaryButton;

    public AddCartController(WebDriver driver){
        PageFactory.initElements(driver,this);

}
public void enterShoppingCart(WebDriver driver,String summeryTabs){
        addCartLink.click();
        addSummaryButton.isDisplayed();
        shoppingCartTabs(driver,summeryTabs);

}
public void shoppingCartTabs(WebDriver driver,String summeryTabs){
 driver.findElement(By.xpath("//span[contains (text(),'"+summeryTabs+"')]")).isDisplayed();
}
}
