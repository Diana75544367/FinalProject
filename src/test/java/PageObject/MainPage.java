package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;


    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void inputValueInEmailField(String string){
        inputEmailField.sendKeys(string);

    }
    public void clickOnSubmitButton(){
        elementSubmitButton.click();

    }
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement elementStartTheEnrollment;

    public void clickOnStartTheEnrollment(){
        elementStartTheEnrollment.click();
    }
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement elementReadMoreVirtual;

    public void clickOnReadMoreVirtual(){
        elementReadMoreVirtual.click();
    }
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement elementReadMoreHybrid;

    public void clickOnReadMoreHybrid(){
        elementReadMoreHybrid.click();
    }
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement elementReadMoreInPerson;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;

    public WebElement getVirtualHeader() {
        return virtualHeader;
    }

    public void clickOnReadMoreInPerson(){
        elementReadMoreInPerson.click();
    }




}

