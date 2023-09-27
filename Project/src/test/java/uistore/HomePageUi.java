package uistore;

import org.openqa.selenium.By;

public class HomePageUi {
    public static By depositButton = By.id("deposit-menu-item");
    public static By depositAccountDropDown = By.id("selectedAccount");
    public static By depositAmount = By.id("amount");
    public static By submitButton = By.xpath("//button[text()=' Submit']");
}
