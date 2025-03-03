import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MailRuAutorizationPage {

    public final SelenideElement createMailButton = $(By.xpath("//a[text()='Создать почту']"));
    public final SelenideElement nameField = $(By.cssSelector("#fname"));
    public final SelenideElement lnameField = $(By.cssSelector("#lname"));
    public final SelenideElement selectDayElement = $(By.xpath("//span[text()='День']"));
    public final SelenideElement myDate = $(By.xpath("//span[text()='31']"));
    public final SelenideElement selectMonthElement = $(By.xpath("//span[text()='Месяц']"));
    public final SelenideElement myMonth = $(By.xpath("//span[text()='Март']"));
    public final SelenideElement selectYearElement = $(By.xpath("//span[text()='Год']"));
    public final SelenideElement myYear = $(By.xpath("//span[text()='1992']"));
    public final SelenideElement genderRadioButton = $(By.xpath("//span[text()='Мужской']"));
    public final SelenideElement enterEmailField = $(By.cssSelector("#aaa__input"));
    public final SelenideElement phoneImputField = $(By.cssSelector("#phone-number__phone-input"));
    public final SelenideElement submitButton = $(By.xpath("(//span[text()='Далее'])[2]"));


    @Step
    public MailRuAutorizationPage createMailButtonClick() {
    createMailButton.click();
    switchTo().window(1);

        return this;
    }

    @Step
    public MailRuAutorizationPage enterName (){
        nameField.setValue("Leonid");
        return this;
    }

    @Step
    public MailRuAutorizationPage enterLNane(){
        lnameField.setValue("Gavrilov");
        return this;
    }
    @Step
    public MailRuAutorizationPage selectDay(){
        selectDayElement.click();
       // selectDayElement.selectOption("30");
       myDate.click();

        return this;
    }

    @Step
    public MailRuAutorizationPage selectMonth(){
        selectMonthElement.click();
        myMonth.click();
        return this;
    }
    @Step
    public MailRuAutorizationPage selectYear(){
        selectYearElement.click();
        myYear.click();
        return this;
    }
    @Step
    public MailRuAutorizationPage selectGender(){
        genderRadioButton.click();
        return this;
    }
    @Step
    public MailRuAutorizationPage enterEmail(){
        enterEmailField.setValue("demoqawinter");
        return this;
    }
    @Step
    public MailRuAutorizationPage enterPhone(){
        phoneImputField.setValue("9293435632");
        return this;
    }
    @Step
    public MailRuAutorizationPage submitButtonClick(){
        // Selenide.executeJavaScript("arguments[0].style.visibility='visible'; arguments[0].style.opacity='1'; arguments[0].removeAttribute('disabled');",
         //       $("button.base-0-2-6.primary-0-2-20.fluid-0-2-13"));
        submitButton.scrollIntoView(true).shouldBe(visible, enabled).click();
    return this;
    }

}