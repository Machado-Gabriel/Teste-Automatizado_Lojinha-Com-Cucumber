package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver; // Static = não precisa instanciar pra usar

    public static void inicializaNavegador(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //Abrir navegador
        driver.manage().window().maximize();

    }

    public static WebDriver getDriver() {
        return driver;
    }

}
