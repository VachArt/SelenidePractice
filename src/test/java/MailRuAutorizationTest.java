import org.junit.jupiter.api.Test;

public class MailRuAutorizationTest extends BaseTest {

    @Test
    public void MailRuAutorizationTest(){
        mailRuAutorizationPage
                .createMailButtonClick()
                .enterName()
                .enterLNane()
                .selectDay()
                .selectMonth()
                .selectYear()
                .selectGender()
                .enterEmail()
                .enterPhone()
                .submitButtonClick();
        System.err.println("Ебаааааааааааааааааааааааааааааааааааааа");

    }
}
