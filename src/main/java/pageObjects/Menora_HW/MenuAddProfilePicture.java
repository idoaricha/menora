package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuAddProfilePicture {

    private AppiumDriver mobileDriver;

    public MenuAddProfilePicture(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "505")
    @iOSXCUITFindBy(id = "505")
    public MobileElement btn_camera;

    @AndroidFindBy(accessibility = "507")
    @iOSXCUITFindBy(id = "507")
    public MobileElement btn_gallery;

}
