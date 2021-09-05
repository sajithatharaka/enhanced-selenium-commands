package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VerifyCommands {
    private WebDriver driver;
    @Test
    public void verifyClick(){
        driver=Actions.getWebDriver();
        driver.get("https://sajithatharaka.github.io/employee_registration/html-elements/delayed_html.html");
        Actions.click(driver.findElement(By.xpath("//a[text()='Next']")),10);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
