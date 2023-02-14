package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumGridDrivers {

     static DesiredCapabilities cap = new DesiredCapabilities();
    static WebDriver driver;


    public static WebDriver remoteDriverChromeOptions(){

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.26:4444"),new ChromeOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }


    public static WebDriver remouteDriverFirefoxOptions(){

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.26:4444"),new FirefoxOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }


    public static WebDriver remouteDriverEdgeOptions(){

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.26:4444"),new EdgeOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        return driver;
    }
}
