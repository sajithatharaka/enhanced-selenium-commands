package commands;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntil {
    public static WebElement visibility(WebElement element,long timeOut){
        WebDriverWait wait=new WebDriverWait(Actions.getWebDriver(),timeOut);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement elementToBeClickable(WebElement element,long timeOut){
        WebDriverWait wait=new WebDriverWait(Actions.getWebDriver(),timeOut);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
