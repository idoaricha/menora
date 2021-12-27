package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfile {

    private AppiumDriver mobileDriver;

    public UserProfile(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(accessibility = "500")
    @iOSXCUITFindBy(id = "500")
    public MobileElement img_profile;

    @AndroidFindBy(accessibility = "501")
    @iOSXCUITFindBy(id = "501")
    public MobileElement btn_addPicture;

    @AndroidFindBy(accessibility = "503")
    @iOSXCUITFindBy(id = "503")
    public MobileElement lb_NicknameTitle;

    @AndroidFindBy(accessibility = "509.511")
    @iOSXCUITFindBy(id = "509.511")
    public MobileElement lb_name;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    @iOSXCUITFindBy(xpath = "???")
    public MobileElement txt_nickName;

    @AndroidFindBy(accessibility = "512")
    @iOSXCUITFindBy(id = "512")
    public MobileElement btn_editNick;

    @AndroidFindBy(accessibility = "514.511")
    @iOSXCUITFindBy(id = "514.511")
    public MobileElement lb_id;

    @AndroidFindBy(accessibility = "515.511")
    @iOSXCUITFindBy(id = "515.511")
    public MobileElement lb_dob;

    @AndroidFindBy(accessibility = "516.511")
    @iOSXCUITFindBy(id = "516.511")
    public MobileElement lb_email;

    @AndroidFindBy(accessibility = "517.511")
    @iOSXCUITFindBy(id = "517.511")
    public MobileElement lb_phone;

    @AndroidFindBy(accessibility = "518.511")
    @iOSXCUITFindBy(id = "518.511")
    public MobileElement lb_address;

    @AndroidFindBy(accessibility = "519")
    @iOSXCUITFindBy(id = "519")
    public MobileElement lb_contactPara;


}
