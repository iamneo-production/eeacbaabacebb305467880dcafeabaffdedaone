package pages;

import org.openqa.selenium.WebDriver;

import uistore.DepositPageUi;
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

    public void clickDepositLinkText() throws Exception{
        helper.clickElement(HomePageUi.depositLinkText);
    }

   

    

}
