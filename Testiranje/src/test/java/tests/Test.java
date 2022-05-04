package tests;

import org.junit.jupiter.api.BeforeEach;
import selenium.HomePage;
import selenium.Locators;

public class Test extends HomePage {


    @BeforeEach
    public void setUp(){

      createChromeDriver(Locators.CHROMEDRIVER_PATH);
      openUrl(Locators.POLOVNI_AUTOMOBILI);
    }
    @org.junit.jupiter.api.Test
    public void test1() throws InterruptedException {

       /* HomePage homePage = new HomePage();
        homePage.uRedu().checkDropdown(dropdown).firstCar(firstCarInList).price().fuel().listFuel();*/

        uRedu();
        checkDropdown(dropdown);
        firstCar(firstCarInList);
        Thread.sleep(6000);
        price();
        fuel();
        Thread.sleep(3000);
        listFuel();


    }

}
