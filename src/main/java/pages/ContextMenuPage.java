package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickOnHotSpot() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotSpot)).perform();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_accept() {
        driver.switchTo().alert().accept();
    }


}
