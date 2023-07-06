package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy (id = "gh-ac")
    public WebElement inputSearchBar;

    @FindBy (id = "gh-btn")
    public WebElement buttonSearchSubmit;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void inputSearchTerm(String searchTerm) {
        clearTextSendKeys(inputSearchBar, searchTerm);
    }

    private void clearTextSendKeys(WebElement inputSearchBar, String searchTerm) {
    }


    public void clickSearchSubmitButton() {
        clickElement(buttonSearchSubmit);
    }

    private void clickElement(WebElement buttonSearchSubmit) {
    }


    public SearchResultsPage doSearch(String searchTerm) {
        inputSearchTerm(searchTerm);
        clickSearchSubmitButton();

        return new SearchResultsPage();
    }

}
