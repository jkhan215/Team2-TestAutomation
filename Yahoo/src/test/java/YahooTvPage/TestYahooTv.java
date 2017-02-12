package YahooTvPage;

import Base.CommonAPI;
import SportsPageFactory.YahooSports;
import TVPageFactory.YahooTv;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

/**
 * Created by Russel on 1/26/2017.
 */
public class TestYahooTv extends CommonAPI{
    @Test
    public void TestTvPage() throws InterruptedException{
        YahooTv yahooTv = PageFactory.initElements(driver,YahooTv.class);
        yahooTv.YahooTv();
        sleepFor(3);



    }

}
