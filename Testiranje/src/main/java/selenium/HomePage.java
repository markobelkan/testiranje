package selenium;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.*;

public class HomePage extends Base {

    public static final String uredu = "//a[@class='paBlueButtonPrimary jsCloseGdprNotice js-accept-cookies']";
    public static final String dropdown = "//div[@class='uk-grid']//div[contains(@class,'SumoSelect')]";
    public static final String firstCarInList = "//div[@class='uk-grid uk-margin-remove']//section[@class='uk-width-large-1-6 uk-width-medium-1-2 uk-width-1-2 uk-padding-remove'][1]";
    public static final String locatorPrice = "//h1";
    public static final String fuelInput = "//span[contains(text(),'Gorivo')]";
    public static final String fuelDropdown = "//div[@class='SumoSelect sumo_fuel open']//div[@class='optWrapper selall multiple']//ul[@class='options']//li";


    public HomePage checkDropdown(String chose) {
        List<WebElement> listaDropdown = getDriver().findElements(By.xpath(chose));
        List<String> listStringovaDropdown = new ArrayList<>();

        for (WebElement webElement : listaDropdown) {
            listStringovaDropdown.add(webElement.getText());
        }
        int brojDropdown = listaDropdown.size();
        System.out.println("U filter selekciji postoji " + brojDropdown + " dropdown-a .");

        Assertions.assertEquals(8, brojDropdown);
        return this;
    }

    public HomePage uRedu() {
        click(uredu);
        return this;
    }

    public HomePage firstCar(String choseCar) {
        click(choseCar);
        return this;
    }

    public HomePage price(){
       getTextFromElement(locatorPrice);
        return this;

    }

    public HomePage listFuel() {
        List<WebElement> fuelList = getDriver().findElements(By.xpath(fuelDropdown));
        List<String> fuelStringList = new ArrayList<>();

        for (WebElement webElement1 : fuelList) {
          fuelStringList.add(webElement1.getText());

          String result = webElement1.getText();
            System.out.println(result);

            System.out.println(result.charAt(0));

            //ovo sam pokusavao nesto ali nisam uspeo.
            //int x = Integer.valueOf(result);
            //Arrays.sort(new int[]{x});
            //System.out.println(Arrays.toString(new int[]{x}));

            }
        return this;
    }

    public HomePage fuel(){
        click(fuelInput);
        return this;
    }
}
