package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ConnectDatabaseSQL;

import java.util.List;

/**
 * Created by abra on 1/20/17.
 */
public class TestSearchWithDB extends CommonAPI{

    @Test
    public void searchUsingDB()throws Exception, InterruptedException{

        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);

        ConnectDatabaseSQL db = new ConnectDatabaseSQL();
        List<String> st = db.retrieveDataFromTable("search_items","products");
        for(String data:st) {
            appleSearchBar.searchWithEnter(data);
            sleepFor(2);
            navigateBack();
        }
    }
}
