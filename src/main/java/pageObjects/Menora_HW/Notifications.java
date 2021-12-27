package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class Notifications {
    private AppiumDriver mobileDriver;

    public Notifications(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }


    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(accessibility = "0.127.128")
    @iOSXCUITFindBy(id = "0.127.128")
    public MobileElement lb_startDrive;

    @AndroidFindBy(accessibility = "0.127.129.33")
    @iOSXCUITFindBy(id = "0.127.129.33")
    public MobileElement btn_startDrive;

    @AndroidFindBy(accessibility = "1.127.128")
    @iOSXCUITFindBy(id = "1.127.128")
    public MobileElement lb_drivePackage;

    @AndroidFindBy(accessibility = "1.127.129.33")
    @iOSXCUITFindBy(id = "1.127.129.33")
    public MobileElement btn_drivePackage;

    @AndroidFindBy(accessibility = "2.127.128")
    @iOSXCUITFindBy(id = "2.127.128")
    public MobileElement lb_club;

    @AndroidFindBy(accessibility = "2.127.129.33")
    @iOSXCUITFindBy(id = "2.127.129.33")
    public MobileElement btn_club;

    @AndroidFindBy(accessibility = "3.127.128")
    @iOSXCUITFindBy(id = "3.127.128")
    public MobileElement lb_insurance;

    @AndroidFindBy(accessibility = "3.127.129.33")
    @iOSXCUITFindBy(id = "3.127.129.33")
    public MobileElement btn_insurance;

    @AndroidFindBy(accessibility = "4.127.128")
    @iOSXCUITFindBy(id = "4.127.128")
    public MobileElement lb_benefits;

    @AndroidFindBy(accessibility = "4.127.129.33")
    @iOSXCUITFindBy(id = "4.127.129.33")
    public MobileElement btn_benefits;

}
