package PageFactoryNbaStatsPage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/18/2017.
 */
public class NBAStat extends CommonAPI {
    @FindBy(how = How.XPATH, using =".//*[@id='block-mainnavigation']/n.//*[@id='daily_leaders']/div/div[2]/section[2]/div[1]/h2/aav/div[2]/ul/li[5]/a")
    public static WebElement statsBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='daily_leaders']/div/div[2]/section[1]/div[1]/h2/a")
    public static WebElement pointsBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='daily_leaders']/div/div[2]/section[2]/div[1]/h2/a")
    public static WebElement reboundsBtm;
    @FindBy(how = How.XPATH,using = ".//*[@id='daily_leaders']/div/div[2]/section[3]/div[1]/h2/a")
    public static WebElement blocksBtm;
    @FindBy(how = How.XPATH,using = ".//*[@id='daily_leaders']/div/div[2]/section[3]/div[1]/h2/a")
    public static WebElement assistBtm;

    public void pointsPage(){
        statsBtm.click();
        pointsBtm.click();
    }
    public void reboundPage(){
        statsBtm.click();
        reboundsBtm.click();
    }
    public void blockPage(){
        statsBtm.click();
        blocksBtm.click();
    }
    public void assistsPage(){
        statsBtm.click();
        assistBtm.click();
    }
}
