package PageFactoryNbaHomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/14/2017.
 */
public class NbaHomePage extends CommonAPI {
    WebDriver homePageObjectDrver;

    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[1]/a")
    public static WebElement gamesBtm;

    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[2]/a")
    public static WebElement topStoriesBtm;
    @FindBy(how = How.XPATH, using= ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[4]/a")
    public static WebElement standingsBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[5]/a")
    public static WebElement statsBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[6]/a")
    public static WebElement playersBtm;
    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[7]/a")
    public static WebElement teamsBtm;


    public void gameHomePage() throws InterruptedException {
        gamesBtm.click();
    }
    public void topStories() throws InterruptedException {
        topStoriesBtm.click();
    }
    public void standingsPages() throws InterruptedException {
        standingsBtm.click();
    }
    public void statsPage() throws InterruptedException {
        statsBtm.click();
    }
    public void playersPage() throws InterruptedException {
        playersBtm.click();
    }
    public void teamPage() throws InterruptedException {
        teamsBtm.click();

    }




}
