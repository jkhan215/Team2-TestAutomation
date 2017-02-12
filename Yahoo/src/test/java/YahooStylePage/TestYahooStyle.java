package YahooStylePage;

import Base.CommonAPI;
import StylePageFactory.YahooStyle;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Russel on 1/27/2017.
 */
public class TestYahooStyle extends CommonAPI {
    @Test
    public void TestYahooStyle () throws InterruptedException{
        YahooStyle YahooStyle = PageFactory.initElements(driver,YahooStyle.class);
        YahooStyle.YahooStyle ();
        sleepFor(3);

    }
}
