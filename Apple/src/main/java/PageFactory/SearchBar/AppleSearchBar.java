package PageFactory.SearchBar;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 1/18/17.
 */
public class AppleSearchBar extends CommonAPI {

    @FindBy(how = How.XPATH, using=".//*[@id='ac-globalnav']/div/ul[2]/li[9]/a")
    public WebElement homePageSearchIcon;

    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-searchform-input']")
    public WebElement homePageSearchField;

    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-searchform-submit']")
    public WebElement submitSearchBarIcon;

    @FindBy(how = How.XPATH, using=".//*[@id='explore-tab']/div/div[1]/h1")
    public WebElement resultsFound;


    public void searchWithEnter(String product) {
        homePageSearchIcon.click();
        homePageSearchField.sendKeys(product, Keys.ENTER);
    }

    public void clearSearchInput(){
        homePageSearchIcon.click();
        homePageSearchField.clear();
    }

    public void searchIPhoneInSearchBar(){
        homePageSearchIcon.click();
        homePageSearchField.sendKeys("iPhone 7");
        submitSearchBarIcon.click();
    }

}
