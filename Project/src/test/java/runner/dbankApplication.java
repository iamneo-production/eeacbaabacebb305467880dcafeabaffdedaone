package runner;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Base;

public class dbankApplication extends Base {
    @BeforeMethod
    public void startUp() throws MalformedURLException {
        driver = openBrowser();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(null, IMPLICIT_WAIT_TIME, PAGE_LOAD_TIME, IMPLICIT_WAIT_TIME));
    }

    @Test(priority = 1)
    public void verifySignIn() {

    }

    @AfterTest
    public void end() {

    }
}
