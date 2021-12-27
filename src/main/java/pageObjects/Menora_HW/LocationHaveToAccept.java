package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationHaveToAccept {

    private AppiumDriver mobileDriver;

    public LocationHaveToAccept(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "20")
    @iOSXCUITFindBy(id = "20")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "21")
    @iOSXCUITFindBy(id = "21")
    public MobileElement lb_para;

    @AndroidFindBy(accessibility = "22")
    @iOSXCUITFindBy(id = "22")
    public MobileElement img_hand;

    @AndroidFindBy(accessibility = "23.11")
    @iOSXCUITFindBy(id = "23.11")
    public MobileElement lb_approveLocation;

    @AndroidFindBy(accessibility = "23.10")
    @iOSXCUITFindBy(id = "23.10")
    public MobileElement btn_approveLocation;

}
