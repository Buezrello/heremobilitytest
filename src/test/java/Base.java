import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public abstract class Base {

    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;

    @Before
    public void setUp() throws MalformedURLException, URISyntaxException {

        DesiredCapabilities caps = new DesiredCapabilities();

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("base.apk");

        try {
            String app = new File(resource.toURI()).getAbsolutePath();
            caps.setCapability("app", app);
        } catch (NullPointerException e) {
            caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
            caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
        }

        caps.setCapability("deviceName", "MyAndroifDevice");

        // in case multidevices must be uncommented and changed to an actual udid
//        caps.setCapability("udid", "9886274d4c4f364237");

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("noReset","false");
        caps.setCapability("orientation","LANDSCAPE");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
