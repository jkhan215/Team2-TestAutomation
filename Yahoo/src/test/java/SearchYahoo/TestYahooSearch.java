package SearchYahoo;

import Base.CommonAPI;
import SearchYahooPageFactory.SearchYahoo;
import YahooData.YahooSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Russel on 1/27/2017.
 */
public class TestYahooSearch extends CommonAPI {

    @Test
    public void testYahooSearchWithExcel() throws IOException, InterruptedException {
       SearchYahoo searchYahoo = PageFactory.initElements(driver, SearchYahoo.class);
        YahooSearch yahooSearch = new YahooSearch();
        String[] value = yahooSearch.getData();
        for (int i = 1; i < value.length; i++) {
            searchYahoo.searchFor(value[i]);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
            searchYahoo.clearSearch();


        }

    }
}
