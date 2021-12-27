package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadPackage {
    private AppiumDriver mobileDriver;

    public LoadPackage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(xpath = "//*[@text='טעינת חבילה']") //todo : change
    @iOSXCUITFindBy(xpath = "//*[@text='טעינת חבילה']")
    public MobileElement lb_topLabel;
    //////////////////
    @AndroidFindBy(accessibility = "104.99")
    @iOSXCUITFindBy(id = "104.99")
    public MobileElement lb_packageLabel;

    @AndroidFindBy(accessibility = "104.99")
    @iOSXCUITFindBy(id = "104.99")
    public MobileElement btn_package;

    @AndroidFindBy(accessibility = "104.101")
    @iOSXCUITFindBy(id = "104.101")
    public MobileElement lb_carInfo;
    ////////////////////
    @AndroidFindBy(accessibility = "274")
    @iOSXCUITFindBy(id = "274")
    public MobileElement txt_loadAmount;
    ////////////////
    @AndroidFindBy(accessibility = "110")
    @iOSXCUITFindBy(id = "110")
    public MobileElement lb_howManyKM;

    @AndroidFindBy(accessibility = "109")
    @iOSXCUITFindBy(id = "109")
    public MobileElement btn_howManyKM;
    /////////////////
    @AndroidFindBy(accessibility = "111.90")
    @iOSXCUITFindBy(id = "111.90")
    public MobileElement btn_creditCard;

    @AndroidFindBy(accessibility = "111.85")
    @iOSXCUITFindBy(id = "111.85")
    public MobileElement lb_creditCard;

    @AndroidFindBy(accessibility = "111.87")
    @iOSXCUITFindBy(id = "111.87")
    public MobileElement lb_creditCardInfo;
    ///////////////////
    @AndroidFindBy(accessibility = "112.85")
    @iOSXCUITFindBy(id = "112.85")
    public MobileElement lb_payments;

    @AndroidFindBy(accessibility = "112.88")
    @iOSXCUITFindBy(id = "112.88")
    public MobileElement lb_paymentsAmount;

    @AndroidFindBy(accessibility = "112.90")
    @iOSXCUITFindBy(id = "112.90")
    public MobileElement btn_payments;
    ///////////////////
    @AndroidFindBy(accessibility = "113.11")
    @iOSXCUITFindBy(id = "113.11")
    public MobileElement lb_payment;

    @AndroidFindBy(accessibility = "113.10")
    @iOSXCUITFindBy(id = "113.10")
    public MobileElement btn_payment;

}
