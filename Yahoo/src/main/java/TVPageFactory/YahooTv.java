package TVPageFactory;

import Base.CommonAPI;
import SportsPageFactory.YahooSports;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Russel on 1/26/2017.
 */
public class YahooTv extends CommonAPI{
    @FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div/div[3]/div/li[9]/a")
        public static WebElement yahootvBtn;
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/nav/div/div/div/div[3]/div/div[1]/ul/li[1]/a")
        public static WebElement reviewBtn;
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/nav/div/div/div/div[3]/div/div[1]/ul/li[1]/a")
        public static WebElement recapsBtn;

    public void YahooTv(){
        yahootvBtn.click();
    }

    public void reviewPage(){
        yahootvBtn.click();
        reviewBtn.click();
    }

    public void recaps(){
        yahootvBtn.click();
        recapsBtn.click();
    }
}





