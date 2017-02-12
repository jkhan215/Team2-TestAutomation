package SportsPageFactory;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Russel on 1/25/2017.
 */
public class YahooSports extends CommonAPI {
@FindBy(how = How.XPATH,using ="html/body/div[2]/div/div/div/div/div/div/div[3]/div/li[4]/a")
    public static WebElement sportsBtn;
@FindBy(how = How.XPATH,using = "html/body/div[1]/div/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/nav/div/div/div/div[3]/div/div[1]/ul/li[2]/a")
    public static WebElement nflBtn;
@FindBy (how = How.XPATH,using = "html/body/div[1]/div/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/nav/div/div/div/div[3]/div/div[1]/ul/li[4]/a")
    public static WebElement nbaBtn;
@FindBy (how = How.XPATH,using = "html/body/div[1]/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/nav/div/div/div/div[3]/div/div[1]/ul/li[11]/a")
    public static WebElement soccerBtn;


public void sportsPage(){
    sportsBtn.click();

}
public void nflPage(){
    sportsBtn.click();
    nflBtn.click();
}
public void nbaPage(){
    sportsBtn.click();
    nbaBtn.click();
}
public void SoccerPage(){
    sportsBtn.click();
    soccerBtn.click();
}



}
