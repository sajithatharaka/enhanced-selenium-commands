package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EmployeeRegistrationWithAssertions {
    WebDriver driver;
    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Test
    public void verifyLogin(){
        driver.get("https://sajithatharaka.github.io/employee_registration");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("submit")).click();
        Assert.assertEquals(driver.getTitle(),"Menu");
    }

    @Test
    public void verifyRegistration(){
        driver.get("https://sajithatharaka.github.io/employee_registration/default/basic_details.html");
        driver.findElement(By.id("fname")).sendKeys("Sam");
        driver.findElement(By.id("lname")).sendKeys("Pam");
        driver.findElement(By.xpath("//a[text()='Next']")).click();
        driver.findElement(By.xpath("//a[text()='Next']")).click();
        driver.findElement(By.xpath("//a[text()='Next']")).click();

        String firstName=driver.findElement(By.xpath("//label[text()='First Name']/following-sibling::span")).getText();
        String lastName=driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::span")).getText();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(firstName,"Sam 1");
        softAssert.assertEquals(lastName,"Pam 2");
        softAssert.assertAll();
    }
}
