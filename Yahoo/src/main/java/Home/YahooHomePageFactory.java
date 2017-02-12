package Home;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Russel on 1/25/2017.
 */
public class YahooHomePageFactory extends CommonAPI {

    @FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div/div[3]/div/li[2]/a")
    public static WebElement newsBtm;
    @FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div/div[3]/div/li[3]/a")
    public static WebElement financeBtn;










    public void newsPage(){
        newsBtm.click();
    }

    public void financePage(){
        financeBtn.click();
    }
}


