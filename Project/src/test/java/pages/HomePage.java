package pages;

import org.openqa.selenium.WebDriver;

import utils.WebDriverHelper;

public class HomePage {
     private WebDriver driver;
    private WebDriverHelper helper;
    public HomePage(WebDriver driver){
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

    

}
