package Home;

import PageFactoryNbaHomePage.NbaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Created by Jubar on 1/14/2017.
 */
public class TestNbaHomePage extends NbaHomePage {

    @Test(priority = 1)
    public void testGamePage() throws InterruptedException {
        NbaHomePage homePage = PageFactory.initElements(driver, NbaHomePage.class);
        homePage.gameHomePage();
    }

    @Test(priority = 2)
    public void testTopStoriesPage() throws InterruptedException {
        NbaHomePage homePage = PageFactory.initElements(driver, NbaHomePage.class);
        homePage.topStories();
    }

    @Test(priority = 3)
    public void testStandingPage() throws InterruptedException {
        NbaHomePage homePage = PageFactory.initElements(driver, NbaHomePage.class);
        homePage.standingsPages();
    }

    @Test(priority = 4)
    public void testStatsPage() throws InterruptedException {
        NbaHomePage homePage = PageFactory.initElements(driver, NbaHomePage.class);
        homePage.statsPage();
    }

    @Test(priority = 5)
    public void testPlayersPage() throws InterruptedException {
        NbaHomePage homePage = PageFactory.initElements(driver, NbaHomePage.class);
        homePage.playersPage();
    }

    @Test(priority = 6)
    public void testTeamPage() throws InterruptedException {
        NbaHomePage homePage = PageFactory.initElements(driver, NbaHomePage.class);
        homePage.teamPage();
    }
}