import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static java.lang.Thread.sleep;

public class SiberianTest {
    static SiberianWallnessMainPage siberianWallnessMainPage;


    @BeforeAll
    static void setUp() {
        Configuration.browser = "edge";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;

        siberianWallnessMainPage = new SiberianWallnessMainPage();
    }

    @Test
    public void SiberianTestAutoriazation() {

        open("https://ru.siberianhealth.com/ru/");
        step("Тест авторизации", () -> {
            siberianWallnessMainPage
                    .enterButtonClick()
                    .enterLogin()
                    .enterPassword()
                    .clickBlueButton();


        });
    }

}

