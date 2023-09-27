package pages;

import org.openqa.selenium.WebDriver;

import utils.WebDriverHelper;

public class DepositPage {
     private WebDriver driver;
    private WebDriverHelper helper;
    public DepositPage(WebDriver driver){
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }
}
