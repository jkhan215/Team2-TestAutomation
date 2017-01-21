package HomePage;

import Base.CommonAPI;
import PageFactoryHomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 1/20/2017.
 */
public class TestTwitchHomePage extends CommonAPI {

    @Test(priority = 1)
    public void testSignUp() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.signUp();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.logIn();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 3)
    public void testFreeTrail() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.freeTrail();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 4)
    public void testTwitchPrime() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.twitchPrime();
        sleepFor(2);
        driver.quit();
    }
}
