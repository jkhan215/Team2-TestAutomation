package methods;

import Base.CommonAPI;
import PageFactory.AppleSignIn;
import org.openqa.selenium.support.PageFactory;
import utility.ConnectDatabaseSQL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abra on 1/18/17.
 */
public class CommonMethods extends CommonAPI{

    public Boolean loggedIn=false;

    public void userLogInDB() throws InterruptedException {
        if(!loggedIn){

            AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);

            appleSignIn.appleLoginPage();

            ConnectDatabaseSQL connectDatabaseSQL= new ConnectDatabaseSQL();
            List<String> list = new ArrayList<String>();
            list=connectDatabaseSQL.retrieveDataFromTable("select login_credentials from login_info","login_credentials");
            int i=0;
            typeByXpath("html/body/div[2]/div[4]/div[1]/div[2]/div/div[1]/div/form/fieldset/p/span[1]/input",list.get(i));
            typeByXpath("html/body/div[2]/div[4]/div[1]/div[2]/div/div[1]/div/form/fieldset/p/span[2]/input", list.get(i+1));
            clickByXpath("html/body/div[2]/div[4]/div[1]/div[2]/div/div[1]/div/form/div[2]/button");
            loggedIn=true;
        }

    }



    public void userLogInScanner() throws InterruptedException{
        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);

        appleSignIn.appleLoginPage();

        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter AppleID : ");
        String appleID = stdin.nextLine();
        appleSignIn.appleIDField.sendKeys(appleID);

        System.out.println("Enter Password : ");
        String password = stdin.nextLine();
        appleSignIn.passwordField.sendKeys(password);

        clickByXpath("html/body/div[2]/div[4]/div[1]/div[2]/div/div[1]/div/form/div[2]/button");

    }

}
