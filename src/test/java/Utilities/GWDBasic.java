package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GWDBasic {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        if (driver==null){
            System.out.println("getdriver çalıştı");
            Logger.getLogger("").setLevel(Level.SEVERE); // sisteme ait bütün logları üreten objeye/servise ulaştım ""

            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        }
        return driver;
    }
    public static void quitDriver(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        if (driver !=null){
            driver.quit();
            driver=null;
        }
    }

}
