package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class GroupHW {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin", Keys.TAB);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123", Keys.ENTER);
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        admin.click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
        WebElement selectAll = driver.findElement(By.id("ohrmList_chkSelectAll"));
        selectAll.click();
        boolean flag = true;
        while (flag) {
            for (WebElement row : rows) {
                String rowText = row.getText();
                if (rowText.contains("aaaaa")) {
                    flag = false;
                    WebElement UnselectOne = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
                    UnselectOne.click();
                    System.out.println(rowText);
                    break;
                }
            }
        }
        //WebElement delete=driver.findElement(By.id("btnDelete"));
        //delete.click();
        // WebElement accept=driver.findElement(By.id("dialogDeleteBtn"));
        //accept.click();

            WebElement add = driver.findElement(By.xpath("//input[@name='btnAdd']"));
            add.click();
            WebElement emName = driver.findElement(By.id("systemUser_employeeName_empName"));
            emName.sendKeys("pjpasd pipo papap");
            WebElement userName = driver.findElement(By.id("systemUser_userName"));
            username.sendKeys("juano");
            WebElement passWord = driver.findElement(By.id("systemUser_password"));
            passWord.sendKeys("!@34Ac^&Bv", Keys.TAB);
            WebElement confirm = driver.findElement(By.id("systemUser_confirmPassword"));
            confirm.sendKeys("!@34Ac^&Bv", Keys.TAB);
            WebElement saveBtn = driver.findElement(By.id("btnSave"));
            saveBtn.click();

    }
}
