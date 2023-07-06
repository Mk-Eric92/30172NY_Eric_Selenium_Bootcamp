package test_search;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import homepage.Homepage;
import homepage.SearchResultsPage;

public class TestSearch extends BasePage {

    Homepage homepage;

    @Test(groups = {"smoke", "broken"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testDoSearch")
    public void testDoSearch(String searchTerm, String validationTerm) {
        homepage = new Homepage();

        SearchResultsPage searchResultsPage = homepage.doSearch(searchTerm);

        Assert.assertEquals(searchResultsPage.textSearchTerm.getText(), validationTerm);
    }

}