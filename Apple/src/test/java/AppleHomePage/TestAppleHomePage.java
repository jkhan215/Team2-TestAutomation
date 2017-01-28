package AppleHomePage;

import PageFactory.HomePage.AppleHomePage;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/19/17.
 */
public class TestAppleHomePage extends CommonMethods{



    @Test
    public void testMacButton() throws Exception {
        AppleHomePage appleHomePage = PageFactory.initElements(driver, AppleHomePage.class);
        appleHomePage.macButton.click();
        captureScreenshot(driver,"macbookPage");
        Assert.assertTrue(appleHomePage.titleMacBookPro.isDisplayed());



        //OR
        //String url = driver.getCurrentUrl();
        //Assert.assertEquals(url, "http://www.apple.com/mac/");



    }
}
