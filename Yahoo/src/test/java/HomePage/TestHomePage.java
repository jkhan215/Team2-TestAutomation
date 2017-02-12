package HomePage;

import Base.CommonAPI;
import Home.YahooHomePageFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Russel on 1/25/2017.
 */
public class TestHomePage extends CommonAPI{

    @Test(priority = 1)
    public void testNewsPage() throws InterruptedException {
        YahooHomePageFactory yahooHomePage= PageFactory.initElements(driver,YahooHomePageFactory.class);
        yahooHomePage.newsPage();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 2)
    public void testFinancePage() throws InterruptedException {
        YahooHomePageFactory yahooHomePage= PageFactory.initElements(driver,YahooHomePageFactory.class);
        yahooHomePage.financePage();
        sleepFor(3);
        driver.quit();
    }
}
