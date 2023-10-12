package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class utlity {

    // TODO: capture screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName){
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        Date currntDate=new Date();
        String screenshot=currntDate.toString().replace(" ","-").
                replace(":","-");
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE),
                    new File(System.getProperty("user.dir")+"/src/test/resources/screenshots/"
                            +screenshot+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
