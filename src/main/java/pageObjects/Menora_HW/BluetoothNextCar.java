package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class BluetoothNextCar {
    private AppiumDriver mobileDriver;

    public BluetoothNextCar(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "580")
    @iOSXCUITFindBy(id = "580")
    public MobileElement img_gotit;

    @AndroidFindBy(accessibility = "581")
    @iOSXCUITFindBy(id = "581")
    public MobileElement lb_excellent;

    @AndroidFindBy(accessibility = "582")
    @iOSXCUITFindBy(id = "582")
    public MobileElement lb_para;

    @AndroidFindBy(accessibility = "579.551")
    @iOSXCUITFindBy(id = "579.551")
    public MobileElement btn_skip;

    @AndroidFindBy(accessibility = "579.552")
    @iOSXCUITFindBy(id = "579.552")
    public MobileElement lb_skip;

    @AndroidFindBy(accessibility = "579.553.10")
    @iOSXCUITFindBy(id = "579.553.10")
    public MobileElement btn_continue;

    @AndroidFindBy(accessibility = "579.553.11")
    @iOSXCUITFindBy(id = "579.553.11")
    public MobileElement lb_continue;

}
