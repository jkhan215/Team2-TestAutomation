package AppleHomePage;

import Base.CommonAPI;
import PageFactory.AppleHomePage;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/19/17.
 */
public class TestAppleHomePage extends CommonAPI{



    @Test
    public void testMacButton() throws InterruptedException {
        AppleHomePage appleHomePage = PageFactory.initElements(driver, AppleHomePage.class);
    appleHomePage.macButton.click();
        Assert.assertTrue(appleHomePage.titleMacBookPro.isDisplayed());

//        OR,
        // String url = driver.getCurrentUrl();
           //Assert.assertEquals(url, "www.apple.com/mac/");


    }
}
