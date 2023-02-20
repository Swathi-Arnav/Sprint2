package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@class=\"_3704LK\"]")
    WebElement SearchBar;

    public WebElement getSearchBar() {
        return SearchBar;
    }

    public WebElement getSearchresult() {
        return Searchresult;
    }

    @FindBy(xpath = "//span[@class=\"_10Ermr\"]//span")
    WebElement Searchresult;


    @FindBy(xpath = "//input[@class=\"_3704LK\"]")
    WebElement SearchField;

    public WebElement getSearchField() {
        return SearchField;
    }

    @FindBy(xpath = "//input[@class=\"_3704LK\"]")
    WebElement Search;

    public WebElement getSearch() {
        return Search;
    }

    @FindBy(xpath = "//input[@class=\"_3704LK\"]")
    WebElement Error;

    public WebElement getError() {
        return Error;
    }
}
