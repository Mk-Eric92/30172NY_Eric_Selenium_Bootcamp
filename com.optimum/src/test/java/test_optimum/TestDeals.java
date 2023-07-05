package test_optimum;

import base.BasePage;
import dealspage.DealsPage;
import homepage.HomePage;
import org.testng.annotations.Test;

public class TestDeals extends BasePage {


 @Test
 public void checkForDeals(){
     HomePage homePage = new HomePage();
     DealsPage dealsPage = new DealsPage();
     homePage.clickOnAllDeals();

 }

}
