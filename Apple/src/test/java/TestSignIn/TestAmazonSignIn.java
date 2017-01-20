package TestSignIn;

import PageFactory.AppleSignIn;
import methods.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by abra on 1/18/17.
 */
public class TestAmazonSignIn extends CommonMethods{


    @Test(priority = 1)
    public void signInUsingBlankCredentials() throws Exception {
        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
      appleSignIn.appleLogin("", "");
     Assert.assertTrue(appleSignIn.errorMissingAppleID.isDisplayed());
    }



    @Test(priority = 2)
    public void signInUsingBlankPassword() throws Exception {
        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
    appleSignIn.appleLogin("abrashamchy@gmail.com", "");
        Assert.assertTrue(appleSignIn.errorMissingPassword.isDisplayed());
    }



//    @Test(priority = 3)
//    public void signInUsingCorrectEmail() throws Exception {
//        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
//        appleSignIn.appleLogin("abrashamchy@gmail.com", "");//           <----ENTER PASSWORD BEFORE RUNNING
//       appleSignIn.verifySignIn();
//        Assert.assertTrue(appleSignIn.signOutButton.isDisplayed());
//
//    }

    @Test(priority = 4)
    public void signInUsingScanner() throws Exception{
        userLogInScanner();

    }

    @Test(priority = 5)
    public void singInDB() throws InterruptedException{
        userLogInDB();
    }

}
