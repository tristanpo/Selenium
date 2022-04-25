package com.syntax.review04;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin", Keys.TAB);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123", Keys.ENTER);

        WebElement employeeList = driver.findElement(By.id("menu_pim_viewPimModule"));
        employeeList.click();


        List<WebElement> employees = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        for (int i=0; i<employees.size(); i++) {
            String RowText= employees.get(i).getText();
            if(RowText.contains("Zubair")){
            List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
                checkboxes.get(i).click();

                }

            }
        TakesScreenshot ts=(TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(srcFile, new File("screenshots/HRMS/checkbox.png"));
        } catch(IOException e){
            e.printStackTrace();
        }
        }
    }

