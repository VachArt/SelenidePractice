import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.internal.shadowed.jackson.databind.cfg.ConfigFeature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static java.lang.Thread.sleep;

public class PracticePageTest extends BaseTest{


    @Test
    public void PracticePageTest() {

        open("https://demoqa.com/automation-practice-form");
        step("Заполнение тестовой формы", () -> {
            practicePage
                    .openPage()
                    .enterName()
                    .enterLastName()
                    .enterEmail()
                    .clickGenderButton()
                    .enterNumber()
                    .enterBirthDate()
                    .enterSubjects()
                    .englishWordClick()
                    .clickMusicCheckBox()
                    .zagruzkaFaila()
                    .currentAddressField()
                    .selectStateAction()
                    .ncrStateClick()
                    .selectCityAction()
                    .delhiCitySelect()
                    .submitButtonClick()
                    .switchToFrame();
        });
        System.err.println("Ебааааааааааааааааааааааааааааааааааааа");

        }
    }

