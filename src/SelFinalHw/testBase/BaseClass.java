package SelFinalHw.testBase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    /**
     * method to open a browser
     * method to close browser
     */

    /**
     * this method will navigate to a website by the given url --> javadoc
     * @param url
     */
    public static void openWithSpecificUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /**
     * this method will quit an open browser
     */
    public static void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

    /**
     *
     * @param url
     */
    public static void openNewTab(String url){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('"+url+"')");
    }

    /**
     *
     * @param url
     */
    public static void navigateNewUrl(String url){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver.navigate().to(url);
    }
    public static void pageHandling(){
        String mainPageHandle=driver.getWindowHandle();
        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it=allWindowHandles.iterator();
        mainPageHandle=it.next();
        String childHandle=it.next();
        driver.switchTo().window(childHandle);
    }
}