import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SiberianWallnessMainPage {

    public final SelenideElement enterButton = $(By.xpath("//button[@ng-click=\"modals.authorization.open('ru')\"]"));
    public final SelenideElement loginFieldElement = $(By.name("userLoginName"));
    public final SelenideElement passwordFieldElement = $(By.name("userLoginPass"));
    public final SelenideElement blueButton = $(By.xpath("//button[text()='Войти']"));


    @Step
    public SiberianWallnessMainPage enterButtonClick(){
        enterButton.scrollIntoView(true).click();
        return this;
    }

    @Step
    public SiberianWallnessMainPage enterLogin(){
        loginFieldElement.sendKeys("2608374724");
        return this;
    }

    @Step
    public SiberianWallnessMainPage enterPassword(){
        passwordFieldElement.sendKeys("91216");
        return this;
    }

    @Step
    public SiberianWallnessMainPage clickBlueButton(){
        blueButton.click();
        return this;
    }
}
