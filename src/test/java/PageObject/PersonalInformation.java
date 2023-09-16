package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;

    public PersonalInformation(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void insertFirstName(String string){
        firstNameField.sendKeys(string);
    }
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    public void insertLastName(String string){
        lastNameField.sendKeys(string);
    }
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement usernameField;
    public void insertUsername(String string) {
        usernameField.sendKeys(string);
    }
    @FindBy(xpath ="//*[@id=\"password\"]")
    private WebElement passwordField;

    public void insertPassword(String string){
        passwordField.sendKeys(string);
    }

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;
    public void confirmPasswordField(String string){
        confirmPasswordField.sendKeys(string);
    }
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement elementNextButton;
    public void elementNextButton(){
        elementNextButton.click();

    }

    public void fillInPersonalInformation() {
        insertFirstName("AAA");
        insertLastName("SSSS");
        insertUsername("SSS");
        insertPassword("SSSS");
        confirmPasswordField("SSS");
        elementNextButton();
    }

    public String getPersonalInformationHeader() {
        return personalInformationHeader.getText();
    }

}
