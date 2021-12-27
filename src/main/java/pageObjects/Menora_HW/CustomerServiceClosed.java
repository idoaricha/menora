package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceClosed {

    private AppiumDriver mobileDriver;

    public CustomerServiceClosed(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "???")
    @iOSXCUITFindBy(id = "???")
    public MobileElement btn_back;

    @AndroidFindBy(accessibility = "??")
    @iOSXCUITFindBy(id = "??")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "171")
    @iOSXCUITFindBy(id = "171")
    public MobileElement lb_lowerTitle;

    @AndroidFindBy(accessibility = "173")
    @iOSXCUITFindBy(id = "173")
    public MobileElement lb_hours;

    @AndroidFindBy(accessibility = "175")
    @iOSXCUITFindBy(id = "175")
    public MobileElement lb_phone;

    @AndroidFindBy(accessibility = "176.10")
    @iOSXCUITFindBy(id = "176.10")
    public MobileElement btn_CallMeBack;


}
