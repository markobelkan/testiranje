package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver driver;

    public void createChromeDriver(String chromeDriverPath){
        System.setProperty("webdriver.chrome.driver" , chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openUrl(String url){
        driver.get(url);
    }

    public WebElement findElement(String locator){
        return getDriver().findElement(By.xpath(locator));
    }

    public void click(String locator){
        findElement(locator).click();
    }

    public void clickOnElementIfVisible(String locator){
        boolean isVisible = isElementDisplayed(locator);
        if (!isVisible){
            click(locator);
        }
    }

    public void enterText(String locator,String txt){
        findElement(locator).sendKeys(txt);
    }

    public boolean isElementDisplayed(String locator){
        return findElement(locator).isDisplayed();
    }

    public void quitDriver(){
        driver.quit();
    }

    public void clearText(String locator){
        findElement(locator).clear();
    }

    public String getTextFromElement(String locator){
       String txt = findElement(locator).getText();
        System.out.println("Posto cena nece nikako evo naslova : " + txt);
       return locator;
    }

    public boolean isElementEnabled(String locator){
        return findElement(locator).isEnabled();
    }

    public List<WebElement> getListOfElement(String locator){
        return getDriver().findElements(By.xpath(locator));
    }

    public Integer getItemCountFromDropdown(String locator){
        return getListOfElement(locator).size();
    }



}
