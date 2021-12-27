package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class GotItScreen {

    private AppiumDriver mobileDriver;

    public GotItScreen(AppiumDriver mobileDriver) { //popyup
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "18")
    @iOSXCUITFindBy(id = "18")
    public MobileElement lb_title;

    @AndroidFindBy(accessibility = "19")
    @iOSXCUITFindBy(id = "19")
    public MobileElement img_gotit;

}
