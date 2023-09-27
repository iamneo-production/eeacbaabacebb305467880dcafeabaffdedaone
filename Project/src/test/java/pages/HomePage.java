package pages;

import org.openqa.selenium.WebDriver;

import uistore.HomePageUi;
import uistore.SignInPageUi;
import utils.WebDriverHelper;

public class HomePage {
     private WebDriver driver;
    private WebDriverHelper helper;
    public HomePage(WebDriver driver){
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

    public void clickDepositLink() throws Exception{
        helper.clickElement(HomePageUi.depositLinkText);
    }

    public void selectDepositDropDown(){

    }

    public void sendDepositAmount(){

    }

    public void 

    

}
