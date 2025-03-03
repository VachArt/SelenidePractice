import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PracticePage {

    public final SelenideElement firstNameInputField = $(By.id("firstName"));
    public final SelenideElement lastNameInputField = $(By.cssSelector("#lastName"));
    public final SelenideElement userEmailField = $(By.cssSelector("#userEmail"));
    public final SelenideElement genderRadioButton = $(By.xpath("//label[text()='Other']"));
    public final SelenideElement userPhone = $(By.id("userNumber"));
    public final SelenideElement dateOfBirth = $(By.id("dateOfBirthInput"));
    public final SelenideElement selectYear = $(By.cssSelector(".react-datepicker__year-select"));
    public final SelenideElement selectMonth = $(By.cssSelector(".react-datepicker__month-select"));
    public final SelenideElement dayPick = $(By.cssSelector(".react-datepicker__day"));
    public final SelenideElement subjects = $(By.xpath("//div[@id='subjectsContainer']//input"));
    public final SelenideElement englishWord = $(By.xpath("//div[contains(@class, 'subjects-auto-complete__option') and text()='English']"));
    public final SelenideElement musicCheckBox = $(By.xpath("//input[@type='checkbox' and @id='hobbies-checkbox-3']"));
    public final SelenideElement uploadFileElement = $(By.cssSelector("#uploadPicture"));
    public final SelenideElement currentAddressElement = $(By.id("currentAddress"));
    public final SelenideElement selectStateElement = $(By.id("state"));
    public final SelenideElement ncrState = $(By.xpath("//div[text()='NCR']"));
    public final SelenideElement selectCityElement = $(By.xpath("//div[text()='Select City']"));
    public final SelenideElement delhiCityElement = $(By.xpath("//div[text()='Delhi']"));
    public final SelenideElement submitButton = $(By.id("submit"));
    public final SelenideElement iFrame = $(By.id("google_esf"));

    File file = new File("src/test/resources/sample.jpg");


    @Step("Открыть страницу PracticePage")
    public PracticePage openPage(){
        open(EndPoints.BASE_URL + EndPoints.PRACTICEFORM_ENDPOINT);
        return this;
    }
    @Step
    public PracticePage enterName() {
        firstNameInputField.shouldBe(visible);
        firstNameInputField.setValue("Leonid");
        return this;

    }

    @Step
    public PracticePage enterLastName() {
        firstNameInputField.shouldBe(visible);
        lastNameInputField.setValue("Gavrilov");
        Util.scrollToHalfPage();
        return this;
    }

    @Step
    public PracticePage enterEmail(){
        userEmailField.setValue("magistr890@gmail.com");
        return this;
    }

    @Step
    public PracticePage clickGenderButton(){
        genderRadioButton.click();
        return this;
    }

    @Step
    public PracticePage enterNumber(){
        userPhone.setValue("99650565464");
        return this;
    }

    @Step
    PracticePage enterBirthDate(){
        dateOfBirth.click();
        selectYear.selectOption("1992");
        selectMonth.selectOption("March");
        dayPick.click();
        return this;
    }

    @Step
    PracticePage enterSubjects(){
        subjects.setValue("En");
        return this;
    }

    @Step
    PracticePage englishWordClick(){
        englishWord.click();
        return this;
    }

    @Step
    PracticePage clickMusicCheckBox(){
        actions().moveToElement(musicCheckBox).click().perform();
        return this;
    }

    @Step
    PracticePage zagruzkaFaila(){
        uploadFileElement.uploadFile(file);
        return this;
    }

    @Step
    PracticePage currentAddressField(){
        currentAddressElement.setValue("Bishkek. Chuy, 22, 53");
        return this;
    }

    @Step
    PracticePage selectStateAction(){
        selectStateElement.scrollIntoView(true).click();
        return this;
    }

    @Step
    PracticePage ncrStateClick(){
        ncrState.shouldBe(visible).click();
        return this;
    }

    @Step
    PracticePage selectCityAction(){
        selectCityElement.shouldBe(visible).click();
        return this;
    }

    @Step
    PracticePage delhiCitySelect(){
        delhiCityElement.shouldBe(visible).click();
        return this;
    }

    @Step
    PracticePage submitButtonClick(){
        submitButton.scrollIntoView(true).click();
        return this;
    }

    @Step
    PracticePage switchToFrame(){
        executeJavaScript("arguments[0].style.display='block';", (iFrame));
        switchTo().frame(iFrame);
        switchTo().defaultContent();
        return this;

    }


}

