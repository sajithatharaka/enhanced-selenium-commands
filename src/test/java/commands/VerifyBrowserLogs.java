package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testng.TestListener;

@Listeners(value = TestListener.class)
public class VerifyBrowserLogs {
    WebDriver driver;
    @Test
    public void verifyBrowserLogSuccess(){
       driver= Actions.getWebDriver();
       driver.get("https://sajithatharaka.github.io/employee_registration/");
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.id("password")).sendKeys("123");
       driver.findElement(By.id("submit")).click();
    }

    @Test
    public void verifyBrowserLogFailure(){
        driver= Actions.getWebDriver();
        driver.get("https://sajithatharaka.github.io/employee_registration/");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("submit")).click();
        Assert.assertEquals(driver.getTitle(),"Menu");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
