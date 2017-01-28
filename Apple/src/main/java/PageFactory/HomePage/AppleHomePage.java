package PageFactory.HomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 1/19/17.
 */
public class AppleHomePage extends CommonAPI{

    @FindBy(how = How.XPATH, using=".//*[@id='ac-globalnav']/div/ul[2]/li[2]/a")
    public WebElement macButton;

    @FindBy(how = How.XPATH, using=".//*[@id='main']/section[1]/div/div[1]/span/h2")
    public WebElement titleMacBookPro;


}
