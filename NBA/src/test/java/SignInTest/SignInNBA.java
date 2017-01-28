package SignInTest;

import Base.CommonAPI;
import PageFactorySignIn.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/27/17.
 */
public class SignInNBA extends CommonAPI {


    @Test
    public void navigateSignInPage() throws Exception{
        SignIn signIn = PageFactory.initElements(driver, SignIn.class);
        signIn.signInPage();
    }
}
