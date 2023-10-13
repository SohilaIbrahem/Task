package testcases;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_SearchFunctionality;
import utilities.utlity;

public class TC01_SearchFunctionalityTest extends TestBase{
    String Searchtxt ="amazon";
    String newSearchtxt ="facebook";


    @Test (priority = 1 , description = "check that user can search for anything")
    @Severity(SeverityLevel.CRITICAL)
    public  void SearchFunctionalityTest()
    {
        new P01_SearchFunctionality(driver).UserAddTextInSearchTextArea(Searchtxt);
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "search");
        //TODO: Assertion
        Assert.assertTrue(new P01_SearchFunctionality(driver).searchTxtAssertion());
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "search");
    }


    @Test (priority = 2 , description = "Check user can delete and search with new keyword")
    public void CheckUserCanDeleteAndSearchWithNewThing()
    {
       new P01_SearchFunctionality(driver).UserUpdateSearchText(newSearchtxt);
        //TODO: Assertion
        Assert.assertTrue(new P01_SearchFunctionality(driver).searchNewTxtAssertion());
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "search");
    }


    @Test (priority = 3 , description = "Check Search Field is Displayed")
    public void CheckSearchFieldIsDisplayed()
    {
        Assert.assertTrue(new P01_SearchFunctionality(driver).searchFieldIsExist());
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "searchField");
    }


}
