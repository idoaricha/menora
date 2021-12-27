package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationReject {

    private AppiumDriver mobileDriver;

    public LocationReject(AppiumDriver mobileDriver) { //popyup
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "permission_icon")
    @iOSXCUITFindBy(id = "permission_icon")
    public MobileElement img_location;

    @AndroidFindBy(accessibility = "permission_message")
    @iOSXCUITFindBy(id = "permission_message")
    public MobileElement lb_location;

    @AndroidFindBy(accessibility = "permission_allow_button")
    @iOSXCUITFindBy(id = "permission_allow_button")
    public MobileElement btn_allow;

    @AndroidFindBy(accessibility = "ermission_deny_button")
    @iOSXCUITFindBy(id = "ermission_deny_button")
    public MobileElement btn_deny;



}
