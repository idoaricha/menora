package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuWatchPolicyCarSelect {
    private AppiumDriver mobileDriver;

    public MenuWatchPolicyCarSelect(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }


    @AndroidFindBy(accessibility = "1310.132.134")
    @iOSXCUITFindBy(id = "1310.132.134")
    public MobileElement btn_car1;

    @AndroidFindBy(accessibility = "1310.132.134")
    @iOSXCUITFindBy(id = "1310.132.134")
    public MobileElement lb_car1;

    @AndroidFindBy(accessibility = "1311.132.134")
    @iOSXCUITFindBy(id = "1311.132.134")
    public MobileElement btn_car2;

    @AndroidFindBy(accessibility = "1311.132.134")
    @iOSXCUITFindBy(id = "1311.132.134")
    public MobileElement lb_car2;

    @AndroidFindBy(accessibility = "1312.132.134")
    @iOSXCUITFindBy(id = "1312.132.134")
    public MobileElement btn_car3;

    @AndroidFindBy(accessibility = "1312.132.134")
    @iOSXCUITFindBy(id = "1312.132.134")
    public MobileElement lb_car3;


}
