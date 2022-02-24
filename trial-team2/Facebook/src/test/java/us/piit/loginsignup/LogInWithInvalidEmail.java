package us.piit.loginsignup;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.LogInPage;
import utility.GetProperties;

import java.util.Properties;

public class LogInWithInvalidEmail extends CommonAPI {
    @Test
    public void signInWithInvalidEmail() {
        LogInPage loginPage = new LogInPage(driver);
        Properties prop = GetProperties.loadProperties("src/test/resources/config.properties");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        loginPage.signInWithInvalidEmail();
        Assert.assertEquals(loginPage.getErrorMessage(),"Find your account and log in.");
        waitFor(20);
    }

}
