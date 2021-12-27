package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class BluetoothConnectionChoose {
    private AppiumDriver mobileDriver;

    public BluetoothConnectionChoose(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "566")
    @iOSXCUITFindBy(id = "566")
    public MobileElement lb_carmodel;

    @AndroidFindBy(accessibility = "567")
    @iOSXCUITFindBy(id = "567")
    public MobileElement lb_carnumber;

    @AndroidFindBy(accessibility = "276")
    @iOSXCUITFindBy(id = "276")
    public MobileElement btn_skip;

}
