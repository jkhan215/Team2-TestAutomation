package NBAStatsPage;

import PageFactoryNbaStatsPage.NBAStat;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 1/18/2017.
 */
public class TestNBAStats extends NBAStat{

    @Test(priority = 1)
    public void testNBAPointsPage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
        nbaStat.pointsPage();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 2)
    public void testNbaReboundsPage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
        nbaStat.reboundPage();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 3)
    public void testNbaAssistPage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
        nbaStat.assistsPage();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 4)
    public void testNbaBlocksPage() throws InterruptedException {
        NBAStat nbaStat = PageFactory.initElements(driver,NBAStat.class);
       nbaStat.blockPage();
        sleepFor(2);
        driver.quit();
    }

}

