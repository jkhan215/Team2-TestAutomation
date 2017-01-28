package PageFactorySignIn;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 1/27/17.
 */
public class SignIn extends CommonAPI {

    @FindBy(how = How.XPATH, using=".//*[@id='block-mainnavigation']/nav/div[3]/ul/li[3]/a")
    public WebElement myAccountBtn;

    @FindBy(how = How.XPATH, using=".//*[@id='block-mainnavigation']/nav/div[3]/ul/li[3]/ul/li[1]/a")
    public WebElement signInBtn;

public void signInPage(){
    myAccountBtn.click();
    signInBtn.click();
}



}
