package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Capabilities extends DesiredCapabilities {
    private AppiumDriverLocalService service;
    
    public AppiumDriver<MobileElement> driver;
    
    public int screenHeight;
    public int screenWidth;
    WebDriverWait wait;
    
    protected void preparation() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("uuid", "4034f4af");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "io.flutter.demo.gallery");
        caps.setCapability("appActivity", "io.flutter.demo.gallery.MainActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        // driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:5555/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
        screenHeight = driver.manage().window().getSize().getHeight();
        screenWidth = driver.manage().window().getSize().getWidth();
        System.out.println("ScreenHeight=" + screenHeight);
        System.out.println("ScreenWidth=" + screenWidth);
        System.out.println("~~FINISH INITIATING APPIUM DRIVER");
        
    }
    
    public void waitUntilVisible(By locator) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}