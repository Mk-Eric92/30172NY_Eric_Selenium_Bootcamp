package dealspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsPage extends BasePage {

    public DealsPage() {
        PageFactory.initElements(driver, this);
    }

 @FindBy(xpath = "//*[@id=\"deals-mod-two\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/a")
    public WebElement checkAvailability;

}