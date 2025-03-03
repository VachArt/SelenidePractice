import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Util {

    public static void scrollToHalfPage() {
        long pageHeight = (long) executeJavaScript("return document.body.scrollHeight");
        executeJavaScript("window.scrollTo(0, arguments[0]);", pageHeight / 2);
    }
}
