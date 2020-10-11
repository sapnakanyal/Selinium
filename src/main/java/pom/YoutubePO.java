package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YoutubePO {
    WebDriver driver;

    public YoutubePO(WebDriver driver){
        this.driver=driver;
    }

    By searchBtn = By.xpath("//button[@id='search-icon-legacy']");
    By searchInput = By.xpath("//input[@id='search']");

    public void inputDataForSearch(String string){
        driver.findElement(searchInput).sendKeys(string);
    }

    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();
    }
}
