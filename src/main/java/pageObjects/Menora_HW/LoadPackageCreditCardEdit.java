package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadPackageCreditCardEdit {
    private AppiumDriver mobileDriver;

    public LoadPackageCreditCardEdit(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(xpath = "//*[@text='עדכון כרטיס אשראי']")
    @iOSXCUITFindBy(xpath = "//*[@text='עדכון כרטיס אשראי']") //todo: change!
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "66.271")
    @iOSXCUITFindBy(id = "66.271")
    public MobileElement lb_name;

    @AndroidFindBy(xpath = "//*[@contentDescription='66.272']")
    @iOSXCUITFindBy(xpath = "//*[@contentDescription='66.272']") //todo: change
    public MobileElement txt_name;

    @AndroidFindBy(accessibility = "66.273")
    @iOSXCUITFindBy(id = "66.273")
    public MobileElement lb_name_warning;

    @AndroidFindBy(accessibility = "67.271")
    @iOSXCUITFindBy(id = "67.271")
    public MobileElement lb_id;

    @AndroidFindBy(xpath = "//*[@contentDescription='67.272']")
    @iOSXCUITFindBy(xpath = "//*[@contentDescription='67.272']") //todo: change
    public MobileElement txt_id;

    @AndroidFindBy(accessibility = "67.273")
    @iOSXCUITFindBy(id = "67.273")
    public MobileElement lb_id_warning;

    @AndroidFindBy(xpath = "//*[@text='מספר כרטיס אשראי']")
    @iOSXCUITFindBy(xpath = "//*[@text='מספר כרטיס אשראי']") //todo: change
    public MobileElement lb_credit;

    @AndroidFindBy(xpath = "//*[@class='android.webkit.WebView']")
    @iOSXCUITFindBy(xpath = "//*[@class='android.webkit.WebView']")
    public MobileElement txt_credit;

    @AndroidFindBy(accessibility = "274") //todo: duplicated id
    @iOSXCUITFindBy(id = "274")
    public MobileElement lb_credit_warning;

    @AndroidFindBy(accessibility = "69.268")
    @iOSXCUITFindBy(id = "69.268")
    public MobileElement lb_expirationDate;

    @AndroidFindBy(xpath = "//*[@contentDescription='69.269']")
    @iOSXCUITFindBy(xpath = "//*[@contentDescription='69.269']") //todo: change
    public MobileElement txt_expirationDate;

    @AndroidFindBy(accessibility = "69.270")
    @iOSXCUITFindBy(id = "69.270")
    public MobileElement lb_expirationDate_warning;

    @AndroidFindBy(accessibility = "274???") //todo : duplicate id - change
    @iOSXCUITFindBy(id = "274???")
    public MobileElement lb_generalWarning;

    @AndroidFindBy(accessibility = "11")
    @iOSXCUITFindBy(id = "11")
    public MobileElement lb_continue;

    @AndroidFindBy(accessibility = "10")
    @iOSXCUITFindBy(id = "10")
    public MobileElement btn_continue;

}
