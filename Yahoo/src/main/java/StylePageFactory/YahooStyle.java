package StylePageFactory;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Russel on 1/27/2017.
 */
public class YahooStyle extends CommonAPI {
    @FindBy(how = How.CSS,using = "#yui_3_18_0_4_1485616882884_898")
    public static WebElement styleBtn;

    public void YahooStyle(){
        styleBtn.click();
    }

}
