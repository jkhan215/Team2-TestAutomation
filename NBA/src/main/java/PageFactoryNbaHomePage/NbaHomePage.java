//package PageFactoryNbaHomePage;
//
//import Base.CommonAPI;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
///**
// * Created by Jubar on 1/14/2017.
// */
//public class NbaHomePage extends CommonAPI {
//    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[1]/a")
//    public static WebElement gamesBtm;
//
//    @FindBy(how = How.XPATH, using = ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[2]/a")
//    public static WebElement topStoriesBtm;
//
//    @FindBy(how = How.XPATH, using= ".//*[@id='block-mainnavigation']/nav/div[2]/ul/li[4]/a")
//    public static WebElement standingsBtm;
//
//    public void gamePage() throws InterruptedException {
//        gamesBtm.click();
//        sleepFor(2);
//        driver.quit();
//    }
//    public void topStories() throws InterruptedException {
//        topStoriesBtm.click();
//        sleepFor(2);
//        driver.quit();
//    }
//    public void standingsPages() throws InterruptedException {
//        standingsBtm.click();
//        sleepFor(2);
//        driver.quit();
//    }
//
//
//
//
//}
