package PageFactoryHomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/20/2017.
 */
public class HomePage {

    @FindBy(how = How.XPATH, using = ".//*[@id='ember867']/div/div/div/div[2]/a")
    public static WebElement clickFreeTrailBtm;
    @FindBy(how = How.XPATH,using = ".//*[@id='header_signup']/span")
    public static WebElement clickSignUpBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='header_login']/span")
    public static WebElement clickLogInBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='header_login']/span")
    public static WebElement clickTwitchPrimeBtm;

    public void freeTrail(){
        clickFreeTrailBtm.click();
    }
    public void signUp(){
        clickSignUpBtm.click();
    }
    public void logIn(){
        clickLogInBtm.click();
    }
    public void twitchPrime(){
        clickTwitchPrimeBtm.click();
    }
}
