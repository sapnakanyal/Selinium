package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.YoutubePO;
import util.WebDriverManager;

public class YoutubeTest {
    WebDriver driver;
    WebDriverManager webDriverManager;
    YoutubePO youtubePO;

    @BeforeClass
    public void setUp()
    {
        webDriverManager=new WebDriverManager();
        driver=webDriverManager.launchBrowser("chrome");
    }

    @Test
    public void youtubeSearchTest() throws InterruptedException {
        youtubePO=new YoutubePO(driver);
        driver.get("https://www.youtube.com/");
        youtubePO.inputDataForSearch("oprah's bank account");
        youtubePO.clickSearchBtn();
        Thread.sleep(Long.parseLong("2000"));
    }

    @AfterClass
    public void tearDown()
    {

        driver.quit();

    }
}
