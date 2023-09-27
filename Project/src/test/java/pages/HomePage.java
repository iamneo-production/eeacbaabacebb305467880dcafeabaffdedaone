package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uistore.DepositPageUi;
import uistore.HomePageUi;
import uistore.SignInPageUi;
import utils.WebDriverHelper;

public class HomePage {
    private WebDriver driver;
    private WebDriverHelper helper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

    public void clickDepositLinkText() throws Exception {
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement depositLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Deposit")));
        helper.clickElement(HomePageUi.depositLinkText);
    }

}
