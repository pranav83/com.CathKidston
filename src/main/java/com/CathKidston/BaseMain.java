package com.CathKidston;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BaseMain {
    public static WebDriver driver;


    public static void openBrowser(String Browser) {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriverManager.getInstance(DriverManagerType.EDGE).setup();
        WebDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();

        switch (Browser) {
            case "FireFox":
                driver = new FirefoxDriver();
                break;

            case "Edge":
                driver = new EdgeDriver();
                break;

            case "IExplorer":
                driver = new InternetExplorerDriver();
                break;

            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        driver.quit();
    }
}
