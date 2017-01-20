package SearchNBA;

import Base.CommonAPI;
import PageFactorySearchBar.SearchNbaPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 1/18/2017.
 */
public class SearchNBAPlayers extends CommonAPI {

    @DataProvider(name = "Players")
    public Object [][] createPlayers(){
        return new Object[][]{
                {"Lebron James"},
                {"Stephen Curry"},
                {"Kevin Durant"}
        };
    }
    @Test(dataProvider = "Players")
    public void searchNBAPlayers(String Players) throws InterruptedException {
        SearchNbaPage nbaPage = PageFactory.initElements(driver,SearchNbaPage.class);
        nbaPage.searchFor(Players);
        nbaPage.clearSearchBar();
        driver.quit();
    }
}
