package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    WebDriver driver;

    public WebDriver launchBrowser(String browserName)
    {
        try {

            if(browserName.equals("ff")|| browserName.equals("firefox"))
            {
                System.setProperty("webdriver.gecko.driver","libs/drivers/geckodriver.exe");
                driver=new FirefoxDriver();

            }

            else if(browserName.equals("chrome"))
            {
                System.setProperty("webdriver.chrome.driver","libs/drivers/chromedriver.exe");
                driver=new ChromeDriver();

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return driver;
    }
}