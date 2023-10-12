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
    private final By txtAssertion = By.xpath("//div[@class=\"osrp-blk\"]");

    public P01_SearchFunctionality UserAddTextInSearchTextArea(String txt) {
        driver.findElement(this.SearchTextArea).sendKeys( txt +Keys.ENTER);
        return this;
    }

    public Boolean searchTxtAssertion()
    {
        return driver.findElement(this.txtAssertion).isDisplayed();
    }

}
