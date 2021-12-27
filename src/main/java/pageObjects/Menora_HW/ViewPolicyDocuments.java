package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPolicyDocuments {

    private AppiumDriver mobileDriver;

    public ViewPolicyDocuments(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "1005")
    @iOSXCUITFindBy(id = "1005")
    public MobileElement btn_back;

    @AndroidFindBy(accessibility = "138")
    @iOSXCUITFindBy(id = "138")
    public MobileElement lb_carNumber;

    @AndroidFindBy(accessibility = "139")
    @iOSXCUITFindBy(id = "139")
    public MobileElement btn_packageSelect;

    @AndroidFindBy(accessibility = "1.140.143")
    @iOSXCUITFindBy(id = "1.140.143")
    public MobileElement lb_insuranceDetails;

    @AndroidFindBy(accessibility = "1.140.141")
    @iOSXCUITFindBy(id = "1.140.141")
    public MobileElement btn_insuranceDetails;

    @AndroidFindBy(accessibility = "2.140.143")
    @iOSXCUITFindBy(id = "2.140.143")
    public MobileElement lb_policyConditions;

    @AndroidFindBy(accessibility = "1.140.141")
    @iOSXCUITFindBy(id = "1.140.141")
    public MobileElement btn_policyConditions;



}
