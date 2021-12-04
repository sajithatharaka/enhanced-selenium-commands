package commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LocalizationTest {
    WebDriver driver;

    @Test
    public void localization_test1() throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--lang=zh-cn");
        driver=new ChromeDriver(options);
        driver.get("http://google.com");

        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void localization_test2() throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--lang=da");
        driver=new ChromeDriver(options);
        driver.get("http://google.com");

        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void localization_test3() throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--lang=fr-fr");
        driver=new ChromeDriver(options);
        driver.get("http://google.com");

        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void localization_test4() throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--lang=hi");
        driver=new ChromeDriver(options);
        driver.get("http://google.com");

        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void localization_test5() throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--lang=ja");
        driver=new ChromeDriver(options);
        driver.get("http://google.com");

        Thread.sleep(5000);
        driver.quit();
    }
}
