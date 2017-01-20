package PageFactorySearchBar;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/14/2017.
 */
public class SearchNbaPage extends CommonAPI{
    @FindBy(how = How.XPATH, using= ".//*[@id='block-mainnavigation']/nav/div[3]/ul/li[4]/a")
    public static WebElement searchPage;

    @FindBy(how = How.XPATH, using = ".//*[@id='block-league-content']/div/search/search-results/div[1]/form/input[1]")
    public static WebElement searchBar;

    @FindBy(how = How.XPATH, using= ".//*[@id='block-league-content']/div/search/search-results/div[1]/form/input[2]")
    public static WebElement searchBtm;


    public void searchFor(String item) throws InterruptedException {
        searchPage.click();
        sleepFor(2);
        searchBar.sendKeys(item, Keys.ENTER);
        sleepFor(2);
    }
    public void clearSearchBar(){
        searchBar.clear();
    }

}



