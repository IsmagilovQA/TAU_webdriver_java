package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.ldap.LdapReferralException;

public class AlertsPage {

    private WebDriver driver;
    private By result = By.id("result");
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerAlertConfirmButton = By.xpath("//button[.='Click for JS Confirm']");
    private By triggerPromptAlert = By.xpath("//button[.='Click for JS Prompt']");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirmAlert() {
        driver.findElement(triggerAlertConfirmButton).click();
    }

    public void triggerPromptAlert() {
        driver.findElement(triggerPromptAlert).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void alert_setInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
}
