package commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

public class Actions {
    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void click(WebElement element, long timeOut) {
        try {
            WaitUntil.visibility(element, timeOut);
            WaitUntil.elementToBeClickable(element, timeOut);
            element.click();
        } catch (ElementClickInterceptedException exception) {
            log("Warning :: element was not clicked \n" + exception.getMessage());
            for (long i = 0; i < timeOut; i++) {
                try {
                    sleep(1);
                    element.click();
                    break;
                } catch (ElementClickInterceptedException exception1) {
                    log("Warning :: " + exception1.getMessage() + " Try " + i);
                }
            }
        }
    }

    public static void type(WebElement element,String text,long timeOut){
        WaitUntil.visibility(element,timeOut);
        element.sendKeys(text);
    }

    public static void getBrowserLog(){
        Logs log=driver.manage().logs();
        LogEntries logEntries=log.get(LogType.BROWSER);
        log("======== Browser log - starts ========");
        for(LogEntry logEntry:logEntries){
            log(logEntry.getMessage()+"\n");
        }
        log("======== Browser log - ends ========");    }

    public static void log(String message) {
        System.out.println(message);
    }

    public static void sleep(long timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
