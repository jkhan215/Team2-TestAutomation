package Register;


import PageFactoryRegister.NbaRegister;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 1/17/2017.
 */
public class TestRegister extends NbaRegister {

    @Test(priority = 1)
    public void testNBARegistrarWithValidCredentials() throws InterruptedException {
        NbaRegister nbaRegister = PageFactory.initElements(driver, NbaRegister.class);
         nbaRegister.resgistrarWithValidCredentials();
         sleepFor(2);
         driver.quit();
    }
    @Test(priority = 2)
    public void testRegistrarWithInValidCredentials() throws InterruptedException {
        NbaRegister nbaRegister = PageFactory.initElements(driver, NbaRegister.class);
        nbaRegister.resgistrarWithInvalidCredentials();
        sleepFor(2);
        driver.quit();
    }
}
