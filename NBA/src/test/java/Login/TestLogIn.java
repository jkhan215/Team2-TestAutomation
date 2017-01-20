package Login;

import Base.CommonAPI;
import PageFactoryLogIn.NbaLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 1/17/2017.
 */
public class TestLogIn extends CommonAPI {

    @Test(priority = 1)
    public void testValidEmailAndValidPassword() throws InterruptedException {
        NbaLogin nbaLogin = PageFactory.initElements(driver, NbaLogin.class);
        nbaLogin.clickMyAccount();
        nbaLogin.clickOnSignIn();
        nbaLogin.validEmail();
        nbaLogin.validPassword();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 2)
    public void testInValidEmailAndPassword() throws InterruptedException {
        NbaLogin nbaLogin = PageFactory.initElements(driver, NbaLogin.class);
        nbaLogin.clickMyAccount();
        nbaLogin.clickOnSignIn();
        nbaLogin.invalidEmail();
        nbaLogin.invalidPassWord();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 3)
    public void testValidEmailAndInValidPassword() throws InterruptedException {
        NbaLogin nbaLogin = PageFactory.initElements(driver, NbaLogin.class);
        nbaLogin.clickMyAccount();
        nbaLogin.clickOnSignIn();
        nbaLogin.validEmail();
        nbaLogin.invalidPassWord();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 4)
    public void testInValidEmailAndValidPassword() throws InterruptedException {
        NbaLogin nbaLogin = PageFactory.initElements(driver, NbaLogin.class);
        nbaLogin.clickMyAccount();
        nbaLogin.clickOnSignIn();
        nbaLogin.invalidEmail();
        nbaLogin.invalidPassWord();
        sleepFor(2);
        driver.quit();
    }


}
