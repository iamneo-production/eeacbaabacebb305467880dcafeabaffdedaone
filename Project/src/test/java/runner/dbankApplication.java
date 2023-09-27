package runner;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import pages.SignInPage;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;

public class dbankApplication extends Base {
    Logger log = LoggerHandler.getLogger();
    ExtentReports extentReport = Reporter.generateExtentReport();
    private SignInPage signInPage;

    @BeforeMethod
    public void startUp() throws MalformedURLException {
        driver = openBrowser();
        signInPage = new SignInPage(driver);
    }

    @Test(priority = 1)
    public void verifySignIn() throws Exception {
        ExtentTest test = extentReport.createTest("Registration Page", "Verify Sign In feature");
        signInPage.sendUserName("S@gmail.com");
        log.info("Sent User Name");
        signInPage.sendPassword("P@ssword12");
        log.info("Sent Password");
        signInPage.clickSubmitButton();
        log.info("Clicked Submit Button");
    }

    @AfterTest
    public void end() {

    }
}
