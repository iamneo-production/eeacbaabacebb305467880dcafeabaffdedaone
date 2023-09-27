package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(DepositPageUi.depositAccountDropDown);
        action.moveToElement(element).click();
    }

    public void selectItemFromDropDown(){
        
    }
    public void sendDepositAmount() {

    }

    public void clickSubmitButton() {

    }
}
