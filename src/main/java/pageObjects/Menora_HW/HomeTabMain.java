package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeTabMain {

    private AppiumDriver mobileDriver;

    public HomeTabMain(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "278")
    @iOSXCUITFindBy(id = "278")
    public MobileElement lb_package_Title;

    @AndroidFindBy(accessibility = "277")
    @iOSXCUITFindBy(id = "277")
    public MobileElement btn_packageSelect;

    @AndroidFindBy(accessibility = "281")
    @iOSXCUITFindBy(id = "281")
    public MobileElement lb_carTitle;

    @AndroidFindBy(accessibility = "282")
    @iOSXCUITFindBy(id = "282")
    public MobileElement lb_packageRemained;

    @AndroidFindBy(accessibility = "283")
    @iOSXCUITFindBy(id = "283")
    public MobileElement lb_containerTitle;

    @AndroidFindBy(accessibility = "287.294")
    @iOSXCUITFindBy(id = "287.294")
    public MobileElement btn_packageLoad;


}
