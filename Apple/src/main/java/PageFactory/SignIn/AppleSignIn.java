package PageFactory.SignIn;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 1/18/17.
 */
public class AppleSignIn extends CommonAPI{
    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-bag']/a")
    public WebElement homePageBagButton;

    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-bagview-content']/nav/ul/li[5]/a")
    public WebElement homePageSignInButton;

    @FindBy(how = How.XPATH, using=".//*[@id='login-appleId']")
    public WebElement appleIDField;

    @FindBy(how = How.XPATH, using=".//*[@id='login-password']")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using=".//*[@id='sign-in']")
    public WebElement signInButton;

    @FindBy(how = How.XPATH, using=".//*[@id='coherent_id_6']/span")
    public WebElement errorMissingAppleID;

    @FindBy(how = How.XPATH, using=".//*[@id='coherent_id_6']")
    public WebElement errorMissingPassword;

    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-bagview-content']/nav/ul/li[5]/a")
    public WebElement signOutButton;

    public void appleLogin(String userID, String pass){
        homePageBagButton.click();
        homePageSignInButton.click();
        appleIDField.sendKeys(userID);
        passwordField.sendKeys(pass);
        signInButton.click();
    }


    public void appleLoginPage(){
        homePageBagButton.click();
        homePageSignInButton.click();
    }

    public void verifySignIn(){
        homePageBagButton.click();
    }
}
