package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import uistore.DepositPageUi;
import utils.WebDriverHelper;

public class DepositPage {
    private WebDriver driver;
    private WebDriverHelper helper;

    public DepositPage(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

    public void selectItemFromDepositDropDown() throws Exception {
        helper.clickElement(DepositPageUi.depositAccountDropDown);
        Actions action = new Actions(driver);
        
    }

    public void selectItemFromDropDown(){
        
    }
    public void sendDepositAmount() {

    }

    public void clickSubmitButton() {

    }
}
