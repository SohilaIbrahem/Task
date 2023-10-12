package testcases;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_SearchFunctionality;
import utilities.utlity;

public class TC01_SearchFunctionalityTest extends TestBase{
    String Searchtxt ="amazon";

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public  void SearchFunctionalityTest()
    {
        new P01_SearchFunctionality(driver).UserAddTextInSearchTextArea(Searchtxt);
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "search");
        //TODO: Assertion
        Assert.assertTrue(new P01_SearchFunctionality(driver).searchTxtAssertion());
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "searc");
    }
}
