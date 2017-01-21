package PageFactoryGames;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/20/2017.
 */
public class TwitchGames extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='ember1451']/div/a/div[2]/p[1]")
    public static WebElement clickDotaBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='ember1244']/div/a/div[2]/p[1]")
    public static WebElement clickWarOfCraftBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='ember1238']/div/a/div[2]/p[1]")
    public static WebElement clickOverWatchBtm;

    public void dota2(){
        clickDotaBtm.click();
    }
    public void warOfCraft(){
        clickWarOfCraftBtm.click();
    }
    public void overWatch(){
        clickOverWatchBtm.click();
    }
}
