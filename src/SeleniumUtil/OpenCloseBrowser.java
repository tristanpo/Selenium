package SeleniumUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseBrowser {
public static WebDriver driver;
    public static void openBrowser(String url){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }
    public static void quitBrowser(){
        driver.quit();
    }
    public static void closeBrowser(){
        driver.close();
    }
}
