package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadPackageUpdatedCredit {

    private AppiumDriver mobileDriver;

    public LoadPackageUpdatedCredit(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1006")
    @iOSXCUITFindBy(id = "1006")
    public MobileElement btn_x;

    @AndroidFindBy(accessibility = "81")
    @iOSXCUITFindBy(id = "81")
    public MobileElement img_hand;

    @AndroidFindBy(accessibility = "82")
    @iOSXCUITFindBy(id = "82")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "83")
    @iOSXCUITFindBy(id = "83")
    public MobileElement lb_para;

    @AndroidFindBy(accessibility = "84.11")
    @iOSXCUITFindBy(id = "84.11")
    public MobileElement lb_continue;

    @AndroidFindBy(accessibility = "84.10")
    @iOSXCUITFindBy(id = "84.10")
    public MobileElement btn_continue;

}
