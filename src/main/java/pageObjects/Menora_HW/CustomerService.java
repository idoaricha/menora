package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerService {
    private AppiumDriver mobileDriver;

    public CustomerService(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }


    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(xpath = "//*[@text='שירות ותמיכה']")
    @iOSXCUITFindBy(xpath = "//*[@text='שירות ותמיכה']") //todo:change to other then text
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "0.157.165")
    @iOSXCUITFindBy(id = "0.157.165")
    public MobileElement btn_CustomerService;

    @AndroidFindBy(accessibility = "1.157.165")
    @iOSXCUITFindBy(id = "1.157.165")
    public MobileElement btn_TechnicalSupport;

    @AndroidFindBy(accessibility = "2.157.165")
    @iOSXCUITFindBy(id = "2.157.165")
    public MobileElement btn_Claim;

    @AndroidFindBy(accessibility = "159")
    @iOSXCUITFindBy(id = "159")
    public MobileElement lb_agent;

    @AndroidFindBy(accessibility = "0.158.162")
    @iOSXCUITFindBy(id = "0.158.162")
    public MobileElement btn_agent;

    @AndroidFindBy(accessibility = "161.11")
    @iOSXCUITFindBy(id = "161.11")
    public MobileElement lb_QnA;

    @AndroidFindBy(accessibility = "161.10")
    @iOSXCUITFindBy(id = "161.10")
    public MobileElement btn_QnA;


}
