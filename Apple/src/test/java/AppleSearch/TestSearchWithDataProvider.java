package AppleSearch;

import Base.CommonAPI;
import PageFactory.AppleSearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/20/17.
 */
public class TestSearchWithDataProvider extends CommonAPI {


    @DataProvider(name = "Products")
    public Object[][] createData(){
        return new Object[][]{
                {"iPhone"} ,
                {"Macbook Pro"} ,
                {"iPad"} ,
        };

    }
    @Test(dataProvider = "Products")
    public void searchUsingDataProvider(String data) throws InterruptedException{
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);
        appleSearchBar.searchWithEnter(data);
        appleSearchBar.clearSearchInput();
    }
}
