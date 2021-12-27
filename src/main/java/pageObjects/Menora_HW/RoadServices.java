package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class RoadServices {

    private AppiumDriver mobileDriver;

    public RoadServices(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);

    }

    @AndroidFindBy(accessibility = "147")
    @iOSXCUITFindBy(id = "147")
    public MobileElement lb_carNumber;

    @AndroidFindBy(accessibility = "146")
    @iOSXCUITFindBy(id = "146")
    public MobileElement btn_CarSelect;

    @AndroidFindBy(accessibility = "0.150.151")
    @iOSXCUITFindBy(id = "0.150.151")
    public MobileElement lb_windshieldTitle;

    @AndroidFindBy(accessibility = "0.150.155")
    @iOSXCUITFindBy(id = "0.150.155")
    public MobileElement lb_btn_windshieldTitle;

    @AndroidFindBy(accessibility = "0.150.154")
    @iOSXCUITFindBy(id = "0.150.154")
    public MobileElement btn_windshieldTitle;
    
    @AndroidFindBy(accessibility = "1.150.151")
    @iOSXCUITFindBy(id = "1.150.151")
    public MobileElement lb_towing;

    @AndroidFindBy(accessibility = "1.150.155")
    @iOSXCUITFindBy(id = "1.150.155")
    public MobileElement lb_btn_towing;

    @AndroidFindBy(accessibility = "1.150.154")
    @iOSXCUITFindBy(id = "1.150.154")
    public MobileElement btn_towing;

    @AndroidFindBy(accessibility = "2.150.151")
    @iOSXCUITFindBy(id = "2.150.151")
    public MobileElement lb_subCar;

    @AndroidFindBy(accessibility = "2.150.155")
    @iOSXCUITFindBy(id = "2.150.155")
    public MobileElement lb_btn_subCar;

    @AndroidFindBy(accessibility = "2.150.154")
    @iOSXCUITFindBy(id = "2.150.154")
    public MobileElement btn_subCar;


}
