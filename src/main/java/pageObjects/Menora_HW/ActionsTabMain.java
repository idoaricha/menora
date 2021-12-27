package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsTabMain {

    private AppiumDriver mobileDriver;

    public ActionsTabMain(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "521")
    @iOSXCUITFindBy(id = "521")
    public MobileElement btn_userInfo;

    @AndroidFindBy(accessibility = "525")
    @iOSXCUITFindBy(id = "525")
    public MobileElement btn_CustomerService;

    @AndroidFindBy(accessibility = "6.528")
    @iOSXCUITFindBy(id = "6.528")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "27.527.31")
    @iOSXCUITFindBy(id = "27.527.31")
    public MobileElement btn_notification;
    //*[@id='20.527.32']
    @AndroidFindBy(accessibility = "27.527.32")
    @iOSXCUITFindBy(id = "27.527.32")
    public MobileElement lb_notification;
    //*[@id='21.527.34.33']
    @AndroidFindBy(accessibility = "28.527.34.33")
    @iOSXCUITFindBy(id = "28.527.34.33")
    public MobileElement btn_biometricEnable;
    //*[@id='21.527.32']
    @AndroidFindBy(accessibility = "28.527.32")
    @iOSXCUITFindBy(id = "28.527.32")
    public MobileElement lb_biometricEnable;
    //*[@id='22.527.31']
    @AndroidFindBy(accessibility = "29.527.31")
    @iOSXCUITFindBy(id = "29.527.31")
    public MobileElement btn_packageAutoLoad;
    //*[@id='22.527.32']
    @AndroidFindBy(accessibility = "29.527.32")
    @iOSXCUITFindBy(id = "29.527.32")
    public MobileElement lb_packageAutoLoad;
    //*[@id='22.527.31']
    @AndroidFindBy(accessibility = "30.527.31")
    @iOSXCUITFindBy(id = "30.527.31")
    public MobileElement btn_bluetooth;
    //*[@id='22.527.32']
    @AndroidFindBy(accessibility = "30.527.32")
    @iOSXCUITFindBy(id = "30.527.32")
    public MobileElement lb_bluetooth;

/////////////////////////////////////////////////////
//*[@id='7.528']
    @AndroidFindBy(accessibility = "9.528")
    @iOSXCUITFindBy(id = "9.528")
    public MobileElement lb_policy; /////////////////

    @AndroidFindBy(accessibility = "31.527.31")
    @iOSXCUITFindBy(id = "31.527.31")
    public MobileElement btn_packageLoad;

    @AndroidFindBy(accessibility = "31.527.32")
    @iOSXCUITFindBy(id = "31.527.32")
    public MobileElement lb_packageLoad;

    @AndroidFindBy(accessibility = "32.527.31")
    @iOSXCUITFindBy(id = "32.527.31")
    public MobileElement btn_watchPolicy;

    @AndroidFindBy(accessibility = "32.527.32")
    @iOSXCUITFindBy(id = "32.527.32")
    public MobileElement lb_watchPolicy;

    @AndroidFindBy(accessibility = "33.527.31")
    @iOSXCUITFindBy(id = "33.527.31")
    public MobileElement btn_addCasualDriver;

    @AndroidFindBy(accessibility = "33.527.32")
    @iOSXCUITFindBy(id = "33.527.32")
    public MobileElement lb_addCasualDriver;

    ///////////////////////////////////////////////

    @AndroidFindBy(accessibility = "10.528")
    @iOSXCUITFindBy(id = "10.528")
    public MobileElement lb_service;

    @AndroidFindBy(accessibility = "27.527.31")
    @iOSXCUITFindBy(id = "27.527.31")
    public MobileElement btn_roadServices;

    @AndroidFindBy(accessibility = "34.527.32")
    @iOSXCUITFindBy(id = "34.527.32")
    public MobileElement lb_roadServices;

    @AndroidFindBy(accessibility = "35.527.31")
    @iOSXCUITFindBy(id = "35.527.31")
    public MobileElement btn_garageFind;

    @AndroidFindBy(accessibility = "35.527.32")
    @iOSXCUITFindBy(id = "35.527.32")
    public MobileElement lb_garageFind;

    @AndroidFindBy(accessibility = "36.527.31")
    @iOSXCUITFindBy(id = "36.527.31")
    public MobileElement btn_appraiserFind;

    @AndroidFindBy(accessibility = "36.527.32")
    @iOSXCUITFindBy(id = "36.527.32")
    public MobileElement lb_appraiserFind;

    @AndroidFindBy(accessibility = "37.527.31")
    @iOSXCUITFindBy(id = "37.527.31")
    public MobileElement btn_extraServices;

    @AndroidFindBy(accessibility = "37.527.32")
    @iOSXCUITFindBy(id = "37.527.32")
    public MobileElement lb_extraServices;

//////////////////////////////////////////////////////////

    @AndroidFindBy(accessibility = "11.528")
    @iOSXCUITFindBy(id = "11.528")
    public MobileElement lb_claims;

    @AndroidFindBy(accessibility = "31.527.31")
    @iOSXCUITFindBy(id = "31.527.31")
    public MobileElement btn_fileClaim;

    @AndroidFindBy(accessibility = "31.527.32")
    @iOSXCUITFindBy(id = "31.527.32")
    public MobileElement lb_fileClaim;

    @AndroidFindBy(accessibility = "32.527.31")
    @iOSXCUITFindBy(id = "32.527.31")
    public MobileElement btn_claimStatus;

    @AndroidFindBy(accessibility = "32.527.32")
    @iOSXCUITFindBy(id = "32.527.32")
    public MobileElement lb_claimStatus;

    ////////////////////////////////////////////
    @AndroidFindBy(accessibility = "10.528")
    @iOSXCUITFindBy(id = "10.528")
    public MobileElement lb_aboutTitle;

    @AndroidFindBy(accessibility = "33.527.31")
    @iOSXCUITFindBy(id = "33.527.31")
    public MobileElement btn_about;

    @AndroidFindBy(accessibility = "10.528")
    @iOSXCUITFindBy(id = "33.527.32")
    public MobileElement lb_about;

    @AndroidFindBy(accessibility = "34.527.31")
    @iOSXCUITFindBy(id = "34.527.31")
    public MobileElement btn_faq;

    @AndroidFindBy(accessibility = "34.527.32")
    @iOSXCUITFindBy(id = "34.527.32")
    public MobileElement lb_faq;

    @AndroidFindBy(accessibility = "35.527.31")
    @iOSXCUITFindBy(id = "35.527.31")
    public MobileElement btn_privacyPolicy;

    @AndroidFindBy(accessibility = "35.527.32")
    @iOSXCUITFindBy(id = "35.527.32")
    public MobileElement lb_privacyPolicy;

    @AndroidFindBy(accessibility = "36.527.31")
    @iOSXCUITFindBy(id = "36.527.31")
    public MobileElement btn_accessibility;

    @AndroidFindBy(accessibility = "36.527.32")
    @iOSXCUITFindBy(id = "36.527.32")
    public MobileElement lb_accessibility;

}
