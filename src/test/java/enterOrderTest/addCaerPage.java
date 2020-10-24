package enterOrderTest;

import base.ScriptBase;
import controller.AddCartController;
import org.testng.annotations.Test;

public class addCaerPage extends ScriptBase {

    AddCartController addCartController;

    @Test
    public void verifyOrderTestwithSummery(){
        addCartController=new AddCartController(driver);
        addCartController.enterShoppingCart(driver,"Summary");
    }
    @Test
    public void verifyOrderTestwithSignIn(){
        addCartController=new AddCartController(driver);
        addCartController.enterShoppingCart(driver,"Sign in");
    }
    @Test
    public void verifyOrderTestwithAddress(){
        addCartController=new AddCartController(driver);
        addCartController.enterShoppingCart(driver,"Address");
    }
    @Test
    public void verifyOrderTestwithShipping(){
        addCartController=new AddCartController(driver);
        addCartController.enterShoppingCart(driver,"Shipping");
    }
    @Test
    public void verifyOrderTestwithPayment(){
        addCartController=new AddCartController(driver);
        addCartController.enterShoppingCart(driver,"Payment");
    }
}
