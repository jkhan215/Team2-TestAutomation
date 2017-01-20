package SearchNBA;

import Base.CommonAPI;
import DataToBeSearch.TeamsToBeSearch;
import PageFactorySearchBar.SearchNbaPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Jubar on 1/14/2017.
 */
public class SearchNbaTeams extends CommonAPI {

     @Test
    public void searchNBATeamUsingExcelFile()throws IOException,InterruptedException {
    SearchNbaPage search = PageFactory.initElements(driver, SearchNbaPage.class);
    TeamsToBeSearch teamsSearched = new TeamsToBeSearch();
        String[] value = teamsSearched.getData();
        for (int i = 1; i < value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchBar();


        }


    }
}
