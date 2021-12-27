package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.pagefactory.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class IntroScreen {

    private AppiumDriver mobileDriver;

    public IntroScreen(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1")
    @iOSXCUITFindBy(id = "1")
    public MobileElement btn_goToApp;

    @AndroidFindBy(accessibility = "2")
    @iOSXCUITFindBy(id = "2")
    public MobileElement lb_goToApp;

}
