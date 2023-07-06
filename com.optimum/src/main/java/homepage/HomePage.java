package homepage;

import base.BasePage;
import dealspage.DealsPage;
import mobilepage.MobilePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import store_locator.StoreLocatorPage;

public class HomePage extends BasePage {

    public HomePage() {

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"nav-item-4\"]/div[1]/a" )
    public WebElement dealsButton;

    @FindBy(xpath = "//*[@id=\"nav-item-4_1\"]/div/a")
    public WebElement allDealsButton;
    public DealsPage clickOnAllDeals(){
        safeClickOnElement(dealsButton);
        safeClickOnElement(allDealsButton);
        return new DealsPage();
    }

    @FindBy (xpath = "//*[@id=\"nav-item-2\"]/div[1]/a")
    public WebElement mobileButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/nav/div/div/ul/li[2]/div/div/ul/li[3]/div[1]/a[1]")
    public WebElement phonesButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/nav/div/div/ul/li[2]/div/div/ul/li[3]/div[2]/ul/li[1]/a")
    public WebElement allPhonesButton;

    public MobilePage clickOnAllPhonesButton(){
        safeClickOnElement(mobileButton);
        safeClickOnElement(phonesButton);
        safeClickOnElement(allPhonesButton);
        return new MobilePage();
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[8]/a/b")
    public WebElement storeLocatorButton;

    @FindBy(xpath = "//*[@id=\"q\"]")
    public WebElement zipInputField;

    @FindBy(xpath = "//button[@type='submit']//*[name()='svg']")
    public WebElement locatorSearchButton;

    public StoreLocatorPage locatingNearStore(){
        safeClickOnElement(storeLocatorButton);
        safeClickOnElement(zipInputField);
        zipInputField.sendKeys("11420");
        safeClickOnElement(locatorSearchButton);
        return new StoreLocatorPage();
    }





}