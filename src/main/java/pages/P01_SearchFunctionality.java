package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class P01_SearchFunctionality {
    private WebDriver driver;
    public P01_SearchFunctionality (WebDriver driver) {
        this.driver = driver;
    }

    private final By SearchTextArea = By.xpath("//textarea[@id=\"APjFqb\"]");
    private final By searchResult = By.xpath("//div[@id=\"result-stats\"]");
    private final By txtAssertion = By.xpath("//div[@class=\"osrp-blk\"]");
    private final By newTxtAssert = By.xpath("//div[@class=\"SzZmKb\"]");
    private final By searchField =By.xpath("//div[@class=\"RNNXgb\"]");

    public P01_SearchFunctionality UserAddTextInSearchTextArea(String txt) {
        driver.findElement(this.SearchTextArea).sendKeys( txt +Keys.ENTER);
        return this;
    }
    public P01_SearchFunctionality UserUpdateSearchText( String newTxt) {
        driver.findElement(this.SearchTextArea).clear();
        driver.findElement(this.SearchTextArea).sendKeys(newTxt + Keys.ENTER);
        return this;
    }

    public Boolean searchResultSection()
    {
        return driver.findElement(this.searchResult).isDisplayed();
    }

    public Boolean searchTxtAssertion()
    {

        return driver.findElement(this.txtAssertion).isDisplayed();
    }

    public Boolean searchNewTxtAssertion()
    {

        return driver.findElement(this.newTxtAssert).isDisplayed();
    }
    public Boolean  searchFieldIsExist(){
        return driver.findElement(this.searchField).isDisplayed();
    }

}
