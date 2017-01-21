package SearchTwitch;

import Base.CommonAPI;
import IteamsToBeSearch.SearchIteams;
import PageFactorySearch.SearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Jubar on 1/20/2017.
 */
public class TestTwitchSearch extends CommonAPI {

    @Test
    public void testSearchTwitch() throws IOException, InterruptedException {
        SearchBar searchBar = PageFactory.initElements(driver, SearchBar.class);
        SearchIteams searchIteams = new SearchIteams();
        String[] value = searchIteams.getData();
        for (int i = 1; i < value.length; i++) {
            searchBar.searchTwitch(value[1]);
            searchBar.clearSearchBar();


        }
    }
}