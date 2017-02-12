package SearchYahooPageFactory;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Russel on 1/27/2017.
 */
public class SearchYahoo extends CommonAPI {

    @FindBy(how = How.CSS,using= "#uh-search-box")
    public static WebElement searchBar;

    @FindBy(how = How.CSS,using = "#uh-search-button")
    public static WebElement searchSummit;

    public void searchFor(String items){
        searchBar.sendKeys(items, Keys.ENTER);
    }
    public void clearSearch(){
        searchBar.clear();
    }

}
