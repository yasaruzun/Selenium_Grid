package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGridDrivers {

    static WebDriver driver;

    public static WebDriver remoteDriverChromeOptions() {

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"), new ChromeOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;

    }


    public static WebDriver remoteDriverEdgefoxOptions(){

        try {
            driver=new RemoteWebDriver(new URL("http://192.168.1.4:4444"), new EdgeOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }


}
