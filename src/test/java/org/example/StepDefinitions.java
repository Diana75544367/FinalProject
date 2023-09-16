package org.example;

import PageObject.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;
    PersonalInformation personalInformation;
    CourseOption courseOption;

    ContactInformation contactInformation;

    PaymentInformation paymentInformation;


    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);
        courseOption = new CourseOption(driver);
        paymentInformation = new PaymentInformation(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/user/Downloads/Testing-Env-master/Testing-Env-master/index.html");
    }

    @Given("I am on Personal information page")
    public void i_am_on_personal_information_page() {
        driver.get("file:///C:/Users/user/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }


    @When("the email value of {string} is inputted")
    public void input_email_to_field(String string) {
        contactInformation.writeToEmailInput(string);
    }

    @When("the submit button is clicked")
    public void click_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @When("the start the enrollment button is clicked")
    public void click_StartTheEnrollment_button() {
        mainPage.clickOnStartTheEnrollment();
    }

    @When("the read more for virtual is clicked")
    public void click_Read_More_for_Virtual() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreVirtual();
    }

    @When("the read more for hybrid is clicked")
    public void click_Read_More_Hybrid() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreHybrid();
    }

    @When("the read more for in person is clicked")
    public void click_Read_More_In_Person() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreInPerson();
    }

    @When("the first name is inserted as {string}")
    public void insert_First_Name(String string) {
        personalInformation.insertFirstName(string);
    }

    @When("the last name is inserted as {string}")
    public void insert_Last_Name(String string) {
        personalInformation.insertLastName(string);
    }

    @When("the username is inserted as {string}")
    public void insert_Username(String string) {
        personalInformation.insertUsername(string);
    }

    @When("the password is inserted as {string}")
    public void insert_Password(String string) {
        personalInformation.insertPassword(string);
    }

    @When("the confirmed passsword is inserted as {string}")
    public void insert_Confirm_Password(String string) {
        personalInformation.confirmPasswordField(string);
    }

    @When("the next button is clicked")
    public void click_Next_Button() {
        personalInformation.elementNextButton();
    }


    @Given("I am on the Contact Information page")
    public void iAmOnTheContactInformationPage() {
        driver.get("file:///C:/Users/user/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
    }

    @Then("the newsletter pop-up appears")
    public void theNewsletterPopUpAppears() {
        driver.switchTo().alert().accept();
    }

    @Then("I am taken to the {string} page")
    public void iAmTakenToThePage(String arg0) {
        Assertions.assertEquals(arg0, driver.getTitle());
    }

    @Then("I am taken to the contact information page")
    public void iAmTakenToTheContactInformationPage() {

    }

    @When("the email field of {string} is inserted")
    public void Insert_email(String string) {
        contactInformation.writeToEmailInput(string);
    }


    @And("the phone field is inserted as  {string}")
    public void thePhoneFieldIsInsertedAs(String string) {
        // TODO: Implementare
        contactInformation.setInsertPhoneNumber(string);
    }

    @When("the country field is inserted as {string}")
    public void Insert_Country(String string){
        contactInformation.setInsertCountry(string);
    }

    @When("the city field is inserted as {string}")
    public void Insert_City(String string){
        contactInformation.setInsertCity(string);
    }

    @When("the next button is clicked for personal information")
    public void clickNextButtonPersonalInformation() {
        personalInformation.elementNextButton();
    }

    @When("the post code is inserted as {string}")
    public void Insert_Post_Code(String string){
        contactInformation.InsertPostCode(string);

    }
    @When("the next button is clicked for contact information")
    public void clickNextButtonContctInformation(){
        contactInformation.ElementNextButton();
    }

    @Then("I am taken to the course options page")
    public void iAmTakenToTheCourseOptionsPage() {
        Assertions.assertEquals("Course options", courseOption.getCourseOptionsHeader());
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpg", "");
        }
        driver.quit();
    }

    @Given("I am on the course options page")
    public void iAmOnTheCourseOptionsPage() {
        driver.get("file:///C:/Users/user/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
        contactInformation.fillInContactInformationPage();
    }

    @When("I click on the first course")
    public void iClickOnTheFirstCourse() {
        courseOption.clickOnFirstCourseOptionButton();
    }

    @And("I click on the next button")
    public void iClickOnTheNextButton() {
        courseOption.clickOnNextButton();
    }

    @Then("I am taken to the payment information page")
    public void iAmTakenToThePaymentInformationPage() {
        Assertions.assertEquals("Payment information", paymentInformation.getPaymentInformation());
    }

    @When("the email with value of {string}")
    public void theEmailWithValueOf(String arg0) {
        mainPage.inputValueInEmailField(arg0);
    }

    @Then("I am taken to the personal information page")
    public void iAmTakenToThePersonalInformationPage() {
        Assertions.assertEquals("Personal information", personalInformation.getPersonalInformationHeader() );
    }
}

