package tests;

import commands.Actions;
import functions.SUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VerifyEmployeeRegistrationWithADynamicDataSet {
    WebDriver driver;
    String EXECUTION_ID;
    @BeforeTest
    public void init(){
        driver= Actions.getWebDriver();
        driver.get("https://sajithatharaka.github.io/employee_registration/");
        EXECUTION_ID= SUT.getExecutionID(driver);
    }
    @Test
    public void verifyEmployeeRegistration(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");

        driver.get("https://sajithatharaka.github.io/employee_registration/default/basic_details.html");
        driver.findElement(By.id("fname")).sendKeys("Sam"+EXECUTION_ID);
        driver.findElement(By.id("lname")).sendKeys("Pam"+EXECUTION_ID);
        driver.findElement(By.xpath("//a[text()='Next']")).click();
        driver.findElement(By.xpath("//a[text()='Next']")).click();
        driver.findElement(By.xpath("//a[text()='Next']")).click();

        String firstName=driver.findElement(By.xpath("//label[text()='First Name']/following-sibling::span")).getText();
        Assert.assertEquals(firstName,"Sam"+EXECUTION_ID);
    }

    @AfterTest
    public void tearDown(){
//        driver.quit();
    }
}
