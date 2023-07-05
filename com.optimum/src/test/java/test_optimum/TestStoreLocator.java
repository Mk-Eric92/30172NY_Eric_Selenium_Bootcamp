package test_optimum;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;
import store_locator.StoreLocatorPage;

public class TestStoreLocator extends BasePage {

    @Test
    public void checkStoresInArea(){
        HomePage homePage = new HomePage();
        StoreLocatorPage storeLocatorPage = new StoreLocatorPage();
        homePage.locatingNearStore();
    }
}
