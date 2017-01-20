package PageFactoryLogIn;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Jubar on 1/17/2017.
 */
public class NbaLogin extends CommonAPI {
    WebDriver loginpageDriver;

    @FindBy(how = How.XPATH, using=".//*[@id='block-mainnavigation']/nav/div[3]/ul/li[3]/ul/li[1]/a")
    public static WebElement signInBtm;
    @FindBy(how = How.XPATH, using=".//*[@id='nbaMembershipEmailAddress']")
    public static WebElement emailBtm;
    @FindBy(how = How.XPATH, using= ".//*[@id='nbaMembershipPassword']")
    public static WebElement passWordBtm;
    @FindBy(how = How.XPATH, using= ".//*[@id='nbaMembershipButtonLogin']")
    public static WebElement logInBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[3]/ul/li[3]/a")
    public static WebElement myAccountbtm;

    public void clickMyAccount(){
        myAccountbtm.click();
    }

    public void clickOnSignIn (){
        signInBtm.click();
    }
    public void validEmail() {
        emailBtm.sendKeys("khanajubar@gmail.com");
    }
    public void validPassword(){
        passWordBtm.sendKeys("Hasna215", Keys.ENTER);
    }
    public void clickLoginBtm(){
        logInBtm.click();
    }
    public void invalidEmail(){
        emailBtm.sendKeys("khanjubar@Gmail.com");
    }
    public void invalidPassWord(){
        passWordBtm.sendKeys("asddf",Keys.ENTER);
    }

}
