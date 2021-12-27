package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class RoadServicesError {
    private AppiumDriver mobileDriver;

    public RoadServicesError(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "233.36")
    @iOSXCUITFindBy(id = "233.36")
    public MobileElement btn_x;

    @AndroidFindBy(accessibility = "233.38")
    @iOSXCUITFindBy(id = "233.38")
    public MobileElement img_egg;

    @AndroidFindBy(accessibility = "233.39")
    @iOSXCUITFindBy(id = "233.39")
    public MobileElement lb_para;

    @AndroidFindBy(accessibility = "233.40")
    @iOSXCUITFindBy(id = "233.40")
    public MobileElement lb_contact;
}
