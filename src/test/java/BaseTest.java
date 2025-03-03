import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    static PracticePage practicePage;
    @BeforeAll
static void setUp() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
            .screenshots(true)
            .savePageSource(true));
        BrowserManager.setUpBrowser("Edge");
    // Configuration.browser = "edge";
    Configuration.browserSize = "1920x1080";
    Configuration.headless = false;
    Configuration.holdBrowserOpen = true;
    open("https://demoqa.com/automation-practice-form");
    practicePage = new PracticePage();
    }
}
