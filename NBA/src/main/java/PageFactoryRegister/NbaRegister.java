package PageFactoryRegister;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/17/2017.
 */
public class NbaRegister extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[3]/ul/li[3]/a")
    public static WebElement myAccountbtm;
    @FindBy(how = How.XPATH, using= ".//*[@id='block-mainnavigation']/nav/div[3]/ul/li[3]/ul/li[2]/a")
    public static WebElement createAccountBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='nbaMembershipEmailAddress']")
    public static WebElement eMailAdressBtm;
    @FindBy(how= How.XPATH, using =".//*[@id='nbaMembershipPassword']")
    public static WebElement passWordBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='nbaMembershipPersonalizeMonth']")
    public static WebElement monthBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='nbaMembershipPersonalizeDay']")
    public static WebElement dayBtm;
    @FindBy(how = How.XPATH, using= ".//*[@id='nbaMembershipPersonalizeYear']")
    public static WebElement yearBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='nbaMembershipPostalCode']")
    public static WebElement postalCodebtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='nbaMembershipCountry']")
    public WebElement countryBtm;
    @FindBy(how = How.XPATH, using= ".//*[@id='nbaMembershipCountry']/option[3]")
    public WebElement selectCountry;
    @FindBy(how = How.XPATH,using = ".//*[@id='nbaMembershipButtonCreateAccount']")
    public WebElement createBttm;

    public void resgistrarWithValidCredentials(){
        myAccountbtm.click();
        createAccountBtm.click();
        eMailAdressBtm.sendKeys("team2@gmail.com");
        passWordBtm.sendKeys("tean2");
        monthBtm.sendKeys("09");
        dayBtm.sendKeys("23");
        yearBtm.sendKeys("1990");
        postalCodebtm.sendKeys("19149");



    }
    public void resgistrarWithInvalidCredentials(){
        myAccountbtm.click();
        createAccountBtm.click();
        eMailAdressBtm.click();
        eMailAdressBtm.sendKeys("kkfd@gmail.com");
        passWordBtm.sendKeys("djfdhkdj");
        monthBtm.sendKeys("13");
        dayBtm.sendKeys("34");
        yearBtm.sendKeys("2030");
        postalCodebtm.sendKeys("00000");
        countryBtm.click();
        selectCountry.click();
        countryBtm.click();
    }

}
