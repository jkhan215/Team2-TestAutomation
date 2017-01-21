package TwitchGamePage;

import Base.CommonAPI;
import PageFactoryGames.TwitchGames;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 1/20/2017.
 */
public class TestTwitchGame extends CommonAPI {

    @Test(priority = 1)
    public void testDota2() throws InterruptedException {
        TwitchGames twitchGames = PageFactory.initElements(driver,TwitchGames.class);
        twitchGames.dota2();
        sleepFor(2);
        driver.quit();
    }
    @Test(priority = 2)
    public void testWarOfWarCraft() throws InterruptedException {
        TwitchGames twitchGames = PageFactory.initElements(driver,TwitchGames.class);
        twitchGames.warOfCraft();
        sleepFor(2);
        driver.quit();

    }
    @Test
    public void testOverWatch() throws InterruptedException {
        TwitchGames twitchGames = PageFactory.initElements(driver,TwitchGames.class);
        twitchGames.overWatch();
        sleepFor(2);
        driver.quit();
    }

}
