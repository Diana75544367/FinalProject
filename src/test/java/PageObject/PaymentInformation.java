package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformation {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformationHeader;

    public PaymentInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getPaymentInformation() {
        return paymentInformationHeader.getText();
    }

}
