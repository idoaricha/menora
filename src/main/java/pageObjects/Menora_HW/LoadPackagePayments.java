package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadPackagePayments {

    private AppiumDriver mobileDriver;

    public LoadPackagePayments(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "114")
    @iOSXCUITFindBy(id = "114")
    public MobileElement btn_back;

    @AndroidFindBy(accessibility = "116")
    @iOSXCUITFindBy(id = "116")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "117")
    @iOSXCUITFindBy(id = "117")
    public MobileElement btn_down;

    @AndroidFindBy(accessibility = "120")
    @iOSXCUITFindBy(id = "120")
    public MobileElement btn_up;

    @AndroidFindBy(accessibility = "119")
    @iOSXCUITFindBy(id = "119")
    public MobileElement lb_payment;
//////
    @AndroidFindBy(accessibility = "122")
    @iOSXCUITFindBy(id = "122")
    public MobileElement lb_howManyInEach;

    @AndroidFindBy(accessibility = "123")
    @iOSXCUITFindBy(id = "123")
    public MobileElement lb_totalPayment;

    @AndroidFindBy(accessibility = "124")
    @iOSXCUITFindBy(id = "124")
    public MobileElement lb_intrest;

    @AndroidFindBy(accessibility = "125.11")
    @iOSXCUITFindBy(id = "125.11")
    public MobileElement lb_update;

    @AndroidFindBy(accessibility = "125.10")
    @iOSXCUITFindBy(id = "125.10")
    public MobileElement btn_update;
}
