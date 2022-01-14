package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class SUT {
    final private static long EXECUTION_INIT_TIME=new Date().getTime();
    public static String EXECUTION_ID="";

    public static String getExecutionID(WebDriver driver){
        String version=driver.findElement(By.id("version")).getText();
        EXECUTION_ID=version+"-"+EXECUTION_INIT_TIME;
        return EXECUTION_ID;
    }
}
