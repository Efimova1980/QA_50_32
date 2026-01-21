package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }

    @FindBy(id = "firstName" )
    WebElement inputFirstName;

    @FindBy(id = "lastName")
    WebElement inputLastName;

    @FindBy(id = "userEmail")
    WebElement inputUserEmail;

    @FindBy(id = "userNumber")
    WebElement inputMobail;

    @FindBy(id = "dateOfBirthInput")
    WebElement inputBirthDate;

    @FindBy(id = "subjectsInput")
    WebElement inputSubject;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    WebElement textareaCurAddress;

    @FindBy(id = "react-select-3-input")
    WebElement inputState;

    @FindBy(id = "react-select-4-input")
    WebElement inputCity;

    @FindBy(id = "submit")
    WebElement btnSubmit;

    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement modalMessage;









}
