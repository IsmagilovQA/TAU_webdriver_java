package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.tracing.dtrace.DTraceProviderFactory;

import java.awt.*;

public class NestedFramePage {

    private WebDriver driver;
    private By frametext = By.cssSelector("body");

    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void switchToFrame(String name) {
        driver.switchTo().frame(name);
    }

    public String getFrameText() {
        return driver.findElement(frametext).getText();
    }
}
