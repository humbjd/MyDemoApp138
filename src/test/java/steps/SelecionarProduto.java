package steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SelecionarProduto {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {

        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("name", "Selecionar Produto");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "9.0");
        desiredCapabilities.setCapability("appium:deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator");
        desiredCapabilities.setCapability("appium:deviceOrientation", "portrait");
        desiredCapabilities.setCapability("appium:app", "storage:filename=mda-2.0.0-21.apk");
        desiredCapabilities.setCapability("appium:appPackage", "com.saucelabs.mydemoapp.android");
        desiredCapabilities.setCapability("appium:appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("sauce:options", sauceOptions );
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("https://oauth-humbertojdantas-85849:f98d3b08-acfc-4d53-b3eb-0cb1f9dcd28a@ondemand.us-west-1.saucelabs.com:443/wd/hub");
        //URL remoteUrl = new URL("https://InstrutorIterasys19:7c6bd642-9a06-4e3d-b721-6df004c4e47c@ondemand.us-west-1.saucelabs.com:443/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Dado("que preciso comprar um presente")
    public void que_preciso_comprar_um_presente() {
        // O app da loja é aberto no BeforeClass

    }
    @Quando("clico no {string}")
    public void clico_no(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Entao("exibe a pagina com o nome do {string} e {string}")
    public void exibe_a_pagina_com_o_nome_do_e(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
