package controller;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenController {
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenButton;
    @FindBy(xpath="//li[1]//img[@class='replace-2x']") WebElement womenTaController;
    @FindBy(name = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img") WebElement imputEmail;
}
