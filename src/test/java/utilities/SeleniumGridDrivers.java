package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumGridDrivers {

    static WebDriver driver;

    public static WebDriver remoteDriverChromeOptions(){


        try {
            driver=new RemoteWebDriver(new URL("http://192.168.1.4:4444"),new ChromeOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }



        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }
}
