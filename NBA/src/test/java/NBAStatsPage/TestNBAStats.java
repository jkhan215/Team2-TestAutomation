package NBAStatsPage;

import PageFactoryNbaStatsPage.NBAStat;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 1/18/2017.
 */
public class TestNBAStats extends NBAStat{

    @Test(priority = 1)
    public void testNBADailyPage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
        nbaStat.DailyPage();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 2)
    public void testDailyPage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
        nbaStat.DailyPage();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 4)
    public void testNbaAssistPage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
        nbaStat.assistsPage();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 3)
    public void testGamePage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
       nbaStat.GamePage();
        sleepFor(2);
        driver.quit();
    }

}

