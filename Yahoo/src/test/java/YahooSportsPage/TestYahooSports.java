package YahooSportsPage;

import Base.CommonAPI;
import SportsPageFactory.YahooSports;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Russel on 1/25/2017.
 */
public class TestYahooSports extends CommonAPI {
@Test(priority = 2)
    public void testYahooSportsPage() throws InterruptedException {
    YahooSports yahooSports = PageFactory.initElements(driver,YahooSports.class);
    yahooSports.sportsPage();
    sleepFor(3);
}
@Test(priority = 1)
    public void testNflPage() throws InterruptedException {
    YahooSports yahooSports = PageFactory.initElements(driver,YahooSports.class);
    yahooSports.nflPage();
    sleepFor(3);
}
@Test(priority = 3)
    public void testNbaPage() throws InterruptedException {
    YahooSports yahooSports = PageFactory.initElements(driver,YahooSports.class);
    yahooSports.nbaPage();
    sleepFor(3);
}
@Test (priority = 4)
    public void testSoccer() throws InterruptedException {
    YahooSports yahooSports = PageFactory.initElements(driver,YahooSports.class);
    yahooSports.SoccerPage();
    sleepFor(3);
}
}
