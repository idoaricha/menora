package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class QnA {

    private AppiumDriver mobileDriver;

    public QnA(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(xpath = "//*[@text='שאלות ותשובות']") //TODO: CHANGE!
    @iOSXCUITFindBy(xpath = "//*[@text='שאלות ותשובות']")
    public MobileElement lb_title;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']") //todo : change!
    @iOSXCUITFindBy(xpath = "//*[@class='android.widget.EditText']")
    public MobileElement txt_search;

    @AndroidFindBy(accessibility = "4.320")
    @iOSXCUITFindBy(id = "4.320")
    public MobileElement lb_lowerTitle;

    @AndroidFindBy(accessibility = "6.58.56")
    @iOSXCUITFindBy(id = "6.58.56")
    public MobileElement btn_Q1;

    @AndroidFindBy(accessibility = "61")
    @iOSXCUITFindBy(id = "61")
    public MobileElement lb_contact;

    @AndroidFindBy(accessibility = "59")
    @iOSXCUITFindBy(id = "59")
    public MobileElement btn_contact;


}
