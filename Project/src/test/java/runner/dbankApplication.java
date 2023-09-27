package runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Base;

public class dbankApplication extends Base {
    @BeforeTest
    public void startUp() {

    }

    @Test(priority = 1)
    public void verifySignIn(){
        
    }

    @AfterTest
    public void end() {

    }
}
