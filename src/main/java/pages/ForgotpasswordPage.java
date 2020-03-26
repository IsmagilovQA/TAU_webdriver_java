package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotpasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePassword = By.id("form_submit");
    private By alert = By.id("content");

    public ForgotpasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail( String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSubmit() {
        driver.findElement(retrievePassword).click();
    }

    public String getAlertContent() {
        return driver.findElement(alert).getText();
    }
}
