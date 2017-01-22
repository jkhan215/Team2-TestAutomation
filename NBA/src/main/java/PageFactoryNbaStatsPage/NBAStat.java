package PageFactoryNbaStatsPage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/18/2017.
 */
public class NBAStat extends CommonAPI {
    @FindBy(how = How.XPATH, using =".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[5]/a")
    public static WebElement statsBtm;
    @FindBy(how = How.XPATH, using = "html/body/main/div[2]/div/div[2]/div[3]/div[1]/div/h6[1]/a")
    public static WebElement dailyBtm;
    @FindBy(how = How.XPATH, using = "html/body/main/div[1]/div/nav/div[4]/a")
    public static WebElement gameBtm;
    @FindBy(how = How.XPATH,using = "html/body/main/div[1]/div/nav/div[5]/a")
    public static WebElement ScoreBtm;
    @FindBy(how = How.XPATH,using = ".//*[@id='daily_leaders']/div/div[2]/section[3]/div[1]/h2/a")
    public static WebElement assistBtm;

    public void DailyPage(){
        statsBtm.click();
        dailyBtm.click();
    }
    public void GamePage(){
        statsBtm.click();
       gameBtm.click();
    }
    public void ScorePage(){
        statsBtm.click();
        ScoreBtm.click();
    }
    public void assistsPage(){
        statsBtm.click();
        assistBtm.click();
    }
}
