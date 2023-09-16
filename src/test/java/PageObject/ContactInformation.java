package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement header;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement insertPhoneNumber;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement insertCountry;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement insertCity;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement insertPostCode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement elementNextButton;

    public ContactInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void writeToEmailInput(String string) {
        emailInput.sendKeys(string);
    }

    public void setInsertPhoneNumber(String string) {
        insertPhoneNumber.sendKeys(string);
    }

    public void setInsertCountry(String string){
        insertCountry.sendKeys(string);
    }
    public void setInsertCity(String string){

        insertCity.sendKeys(string);
    }
    public void InsertPostCode(String string){
        insertPostCode.sendKeys(string);
    }
    public void ElementNextButton(){
        elementNextButton.click();
    }

    public void fillInContactInformationPage() {
        writeToEmailInput("test@test.com");
        setInsertCountry("Test");
        setInsertCity("Test");
        setInsertPhoneNumber("(0763) 080 098");
        InsertPostCode("6660897");
        ElementNextButton();
    }

}


