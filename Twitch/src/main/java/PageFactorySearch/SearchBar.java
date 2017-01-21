package PageFactorySearch;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 1/20/2017.
 */
public class SearchBar extends CommonAPI{
    @FindBy(how = How.XPATH, using = ".//*[@id='ember802']/form/div/input")
    public static WebElement searchBarInput;

    public void searchTwitch(String iteams) throws InterruptedException {
        searchBarInput.sendKeys(iteams, Keys.ENTER);
        sleepFor(2);
    }
    public void clearSearchBar(){
        searchBarInput.clear();
    }
}
