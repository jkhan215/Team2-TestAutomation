package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/18/17.
 */
public class TestSearchBar extends CommonAPI {

    @Test(priority = 1)
    public void searchIPhone7() throws Exception{
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);
        appleSearchBar.searchIPhoneInSearchBar();
        Assert.assertTrue(appleSearchBar.resultsFound.isDisplayed());
    }
}
