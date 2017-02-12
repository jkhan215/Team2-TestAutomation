package YahooPoliticsFactory;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Russel on 1/26/2017.
 */
public class YahooPolitics extends CommonAPI{
    @FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div/div[3]/div/li[6]/a")
        public static WebElement politicsBtn;
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/nav/div/div/div/div[3]/div/div[1]/ul/li[1]/a")
        public static WebElement usBtn;

    public void YahooPolitics(){
        politicsBtn.click();

    }
    public void usPage(){
        politicsBtn.click();
        usBtn.click();

    }


}
