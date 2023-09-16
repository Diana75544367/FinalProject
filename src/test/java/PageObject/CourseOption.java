package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOption {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseHeader;

    @FindBy(xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement firstCourseOptionRadioButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButton;


    public CourseOption(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getCourseOptionsHeader() {
        return courseHeader.getText();
    }

    public void clickOnFirstCourseOptionButton() {
        firstCourseOptionRadioButton.click();
    }

    public void clickOnNextButton() {
        nextButton.click();
    }


}
