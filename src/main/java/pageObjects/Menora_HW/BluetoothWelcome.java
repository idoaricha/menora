package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class BluetoothWelcome {

    private AppiumDriver mobileDriver;

    public BluetoothWelcome(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "555")
    @iOSXCUITFindBy(id = "555")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "556")
    @iOSXCUITFindBy(id = "556")
    public MobileElement lb_para;

    @AndroidFindBy(accessibility = "557")
    @iOSXCUITFindBy(id = "557")
    public MobileElement img_bluetooth;

    @AndroidFindBy(accessibility = "554.551")
    @iOSXCUITFindBy(id = "554.551")
    public MobileElement btn_skip;

    @AndroidFindBy(accessibility = "554.553.10")
    @iOSXCUITFindBy(id = "554.553.10")
    public MobileElement btn_continue;

}
