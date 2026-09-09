package com.BaseClass;

import java.net.URL;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class BaseClass {

    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public void launchApplication() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("Pixel_Google");
        options.setUdid("emulator-5554");
        options.setAppPackage("com.bt.bms");
        options.setAppActivity("com.movie.bms.splashscreen.SplashScreenActivity");

        options.setNoReset(false);

        driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                options
        );
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Bookmyshow app launched successfully");
    }

    public void closeApplication() {
            driver.quit();
        
    }
    
    
    //Tap
    
    public static void tap(By locator) {

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    
    //sendkeys
    
    public static void entertext(By locator, String text) {

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        element.clear();
        element.sendKeys(text);
    }
    
    //scroll to text

   public static void scrollToText(String text) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
        AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"" + text + "\"))")));
}
    

   public void scroll(String direction) {

	    wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().scrollable(true)")));

	    driver.executeScript(
	            "mobile: scrollGesture",
	            Map.of(
	                    "left", 100,
	                    "top", 300,
	                    "width", 800,
	                    "height", 1600,
	                    "direction", direction,
	                    "percent", 0.8
	            )
	    );
	}
   //back
   public void clickBackButton() {
	    driver.navigate().back();
	}


public boolean scrolll(String direction) {

    wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().scrollable(true)")));
    Object result = driver.executeScript(
        "mobile: scrollGesture",
        Map.of(
            "left", 100,
            "top", 300,
            "width", 800,
            "height", 1600,
            "direction", direction,
            "percent", 0.8
        )
    );

    return (Boolean) result;
}

public void waitfortap(By locator) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    wait.until(ExpectedConditions.elementToBeClickable(locator));

}

public void waitforvisiblity(By locator) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}

     
}