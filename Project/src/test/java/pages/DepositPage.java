package pages;

import org.openqa.selenium.WebDriver;

import uistore.DepositPageUi;
import utils.WebDriverHelper;

public class DepositPage {
    private WebDriver driver;
    private WebDriverHelper helper;

    public DepositPage(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

    public void clickDepositDropDown() throws Exception {
        helper.clickElement(DepositPageUi.depositAccountDropDown);
    }

    public selectDropDown
    public void sendDepositAmount() {

    }

    public void clickSubmitButton() {

    }
}
