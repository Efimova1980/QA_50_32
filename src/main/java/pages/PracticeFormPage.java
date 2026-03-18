package pages;

import dto.Student;
import enums.Gender;
import enums.Hobbies;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.security.Key;
import java.util.List;

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
    WebElement inputAddress;

    @FindBy(id = "react-select-3-input")
    WebElement inputState;

    @FindBy(id = "react-select-4-input")
    WebElement inputCity;

    @FindBy(id = "submit")
    WebElement btnSubmit;

    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement modalMessage;

    public void typePracticeForm(Student student){
        //hideBanner();
        //hideFooter();
        scrollDown();
        inputFirstName.sendKeys(student.getName());
        inputLastName.sendKeys(student.getLastName());
        inputUserEmail.sendKeys(student.getEmail());
        inputMobail.sendKeys(student.getMobile());
        inputAddress.sendKeys(student.getAddress());
        typeGender(student.getGender());
        typeDateOfBirth(student.getDateOfBirth());
        typeSubjects(student.getSubjects());
        typeHobbies(student.getHobby());
        typeStateCity(student.getState(), student.getCity());
        btnSubmit.click();
    }

    private void typeStateCity(String state, String city){
        inputState.sendKeys(state);
        inputState.sendKeys(Keys.ENTER);
        inputCity.sendKeys(city);
        inputCity.sendKeys(Keys.ENTER);
    }

    private void typeHobbies(List<Hobbies> hobbies){
        for (Hobbies h: hobbies){
            switch (h){
                case SPORTS -> driver.findElement(By.xpath(h.getLocator())).click();
                case READING -> driver.findElement(By.xpath(h.getLocator())).click();
                case MUSIC -> driver.findElement(By.xpath(h.getLocator())).click();
            }
        }
    }

    private void typeGender(Gender gender){
        WebElement btnGender = driver.findElement(By.xpath(gender.getLocator()));
        btnGender.click();
    }

    private void typeDateOfBirth(String dateOfBirth){
        inputBirthDate.click();
        String operationSystem = System.getProperty("os.name");
        System.out.println(operationSystem);
        if (operationSystem.startsWith("Win"))
            inputBirthDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        else if (operationSystem.startsWith("Mac"))
            inputBirthDate.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        inputBirthDate.sendKeys(dateOfBirth);
        inputBirthDate.sendKeys(Keys.ENTER);
    }

    private void typeSubjects(String subjects){
        inputSubject.click();
        String[] arr = subjects.split(",");
        for (String s: arr){
            inputSubject.sendKeys(s);
            inputSubject.sendKeys(Keys.ENTER);
        }
    }

    public boolean validateModalMessage(String text){
        return validateTextInElement(modalMessage, text);
    }
}
