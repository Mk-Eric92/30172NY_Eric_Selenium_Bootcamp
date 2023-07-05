package test_optimum;

import base.BasePage;
import homepage.HomePage;
import mobilepage.MobilePage;
import org.testng.annotations.Test;

public class TestCheckAllPhones extends BasePage {

    @Test
    public void checkForPhones(){
        HomePage homePage = new HomePage();
        MobilePage mobilePage = new MobilePage();
        homePage.clickOnAllPhonesButton();
    }
}
