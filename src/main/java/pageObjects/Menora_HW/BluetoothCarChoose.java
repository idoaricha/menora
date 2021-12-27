package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class BluetoothCarChoose {

    private AppiumDriver mobileDriver;

    public BluetoothCarChoose(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "559")
    @iOSXCUITFindBy(id = "559")
    public MobileElement lb_para;

    @AndroidFindBy(accessibility = "557")
    @iOSXCUITFindBy(id = "557")
    public MobileElement img_bluetooth;

    @AndroidFindBy(accessibility = "0.560.561")
    @iOSXCUITFindBy(id = "0.560.561")
    public MobileElement btn_car1;

    @AndroidFindBy(accessibility = "1.560.561")
    @iOSXCUITFindBy(id = "1.560.561")
    public MobileElement btn_car2;

}
