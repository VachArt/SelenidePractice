import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;


public class BrowserManager {
    public static void setUpBrowser(String browser){
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            Selenide.webdriver().driver();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(
                    "--no-sandbox",
                    "--proxy-bypass-list=<-loopback>",
                    "--disable-dev-shm-usage",
                    "--remote-allow-origins=*",
                    "--ignore-certificate-errors",
                    "--hide-scrollbars",
                    "--incognito"

            );
            Configuration.browserCapabilities = chromeOptions;
            Configuration.browser = Browsers.CHROME;
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments(
                    "--no-sandbox",
                    "--remote-allow-origins=*",
                     "--inprivat"
            );
            Configuration.browserCapabilities = edgeOptions;
            Configuration.browser = Browsers.EDGE;
        }

    }
}
