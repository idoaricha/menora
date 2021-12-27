package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoRenewalPackage {
    private AppiumDriver mobileDriver;

    public AutoRenewalPackage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(accessibility = "???")
    @iOSXCUITFindBy(id = "???")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "49")
    @iOSXCUITFindBy(id = "49")
    public MobileElement lb_para;

    @AndroidFindBy(accessibility = "50")
    @iOSXCUITFindBy(id = "50")
    public MobileElement lb_package1;

    @AndroidFindBy(accessibility = "51.33")
    @iOSXCUITFindBy(id = "51.33")
    public MobileElement btn_package1;



}
