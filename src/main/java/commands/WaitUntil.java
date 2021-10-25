package commands;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
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

    public static boolean waitForElementToDisplay(WebElement element,int timeOutInSeconds){
        boolean isDisplayed=false;
        for(int i=0;i<timeOutInSeconds;i++){
            try {
                if(element.isDisplayed()){
                    Actions.log(element.toString()+" is visible");
                    isDisplayed=true;
                    break;
                }
            }catch (NoSuchElementException exception){
                Actions.log(element.toString()+" is not visible");
                Actions.sleep(1);
            }
        }
        return isDisplayed;
    }

    public static boolean waitForElementToHide(WebElement element,int timeOutInSeconds){
        boolean isNotDisplayed=false;
        try {
            for (int i=0;i<timeOutInSeconds;i++){
                if(element.isDisplayed()){
                    Actions.log(element.toString()+" is visible");
                    Actions.sleep(1);
                }
            }
        }catch (NoSuchElementException | StaleElementReferenceException exception){
            Actions.log(element.toString()+" is hidden");
            isNotDisplayed=true;
        }
        return isNotDisplayed;
    }

    public static boolean waitForElementContentToDisplay(WebElement element,int timeOutInSeconds){
        boolean _isContentDisplayed=false;
        for(int i=0;i<timeOutInSeconds;i++){
            String text=element.getAttribute("value");
            if(text==null){
                text=element.getText();
            }
            if(text!=null && !text.equals("")){
                Actions.log(element.toString()+" is visible");
                _isContentDisplayed=true;
                break;
            }else{
                Actions.log(element.toString()+" is not visible");
                Actions.sleep(1);
            }
        }
        return _isContentDisplayed;
    }

}
