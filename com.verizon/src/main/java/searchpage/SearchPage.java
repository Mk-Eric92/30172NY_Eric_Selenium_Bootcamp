package searchpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchPage extends BasePage {

    public SearchPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search_box_gnav_input']")
    public WebElement inputSearchBox;

    public void enterSearchTerm(String searchTerm){
        sendKeysToElement(inputSearchBox, searchTerm);
    }

//    public void pressEnterKey(){
 //       try {
 //           Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_ENTER);
 //           robot.keyRelease(KeyEvent.VK_ENTER);
 //       } catch (Exception e) {
 //           e.printStackTrace();
 //       }
 //   }
    public void doSearch(String searchTerm){
        enterSearchTerm(searchTerm);
        pressEnterKey();
    }


}
