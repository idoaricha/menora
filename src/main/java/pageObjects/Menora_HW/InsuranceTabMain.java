package pageObjects.Menora_HW;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InsuranceTabMain {
    private AppiumDriver mobileDriver;

    public InsuranceTabMain(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);
    }

    @AndroidFindBy(accessibility = "529")
    @iOSXCUITFindBy(id = "529")
    public MobileElement lb_title;

////////////////////////////

    @AndroidFindBy(accessibility = "0.530.534")
    @iOSXCUITFindBy(id = "0.530.534")
    public MobileElement img_car1;

    @AndroidFindBy(accessibility = "0.530.535")
    @iOSXCUITFindBy(id = "0.530.535")
    public MobileElement lb_carNum1;

    @AndroidFindBy(accessibility = "0.530.536")
    @iOSXCUITFindBy(id = "0.530.536")
    public MobileElement lb_carModel1;

    @AndroidFindBy(accessibility = "0.530.537")
    @iOSXCUITFindBy(id = "0.530.537")
    public MobileElement lb_insuranceValidity1;

    @AndroidFindBy(accessibility = "0.530.538")
    @iOSXCUITFindBy(id = "0.530.538")
    public MobileElement lb_insuranceType1;

    @AndroidFindBy(accessibility = "0.530.540")
    @iOSXCUITFindBy(id = "0.530.540")
    public MobileElement lb_PolicyNum1;
    ////////////////////////////////////

    @AndroidFindBy(accessibility = "1.530.534")
    @iOSXCUITFindBy(id = "1.530.534")
    public MobileElement img_car2;

    @AndroidFindBy(accessibility = "1.530.535")
    @iOSXCUITFindBy(id = "1.530.535")
    public MobileElement lb_carNum2;

    @AndroidFindBy(accessibility = "1.530.536")
    @iOSXCUITFindBy(id = "1.530.536")
    public MobileElement lb_carModel2;

    @AndroidFindBy(accessibility = "1.530.537")
    @iOSXCUITFindBy(id = "1.530.537")
    public MobileElement lb_insuranceValidity2;

    @AndroidFindBy(accessibility = "1.530.538")
    @iOSXCUITFindBy(id = "1.530.538")
    public MobileElement lb_insuranceType2;

    @AndroidFindBy(accessibility = "1.530.540")
    @iOSXCUITFindBy(id = "1.530.540")
    public MobileElement lb_PolicyNum2;
    ////////////////////////////////////////
    @AndroidFindBy(accessibility = "2.530.534")
    @iOSXCUITFindBy(id = "2.530.534")
    public MobileElement img_car3;

    @AndroidFindBy(accessibility = "2.530.535")
    @iOSXCUITFindBy(id = "2.530.535")
    public MobileElement lb_carNum3;

    @AndroidFindBy(accessibility = "2.530.536")
    @iOSXCUITFindBy(id = "2.530.536")
    public MobileElement lb_carModel3;

    @AndroidFindBy(accessibility = "2.530.537")
    @iOSXCUITFindBy(id = "2.530.537")
    public MobileElement lb_insuranceValidity3;

    @AndroidFindBy(accessibility = "2.530.538")
    @iOSXCUITFindBy(id = "2.530.538")
    public MobileElement lb_insuranceType3;

    @AndroidFindBy(accessibility = "2.530.540")
    @iOSXCUITFindBy(id = "2.530.540")
    public MobileElement lb_PolicyNum3;
    ////////////////////////////////////////

    @AndroidFindBy(accessibility = "531")
    @iOSXCUITFindBy(id = "531")
    public MobileElement btn_watchPolicy;

    ///////////////////////////////////

    @AndroidFindBy(accessibility = "0.533.541")
    @iOSXCUITFindBy(id = "0.533.541")
    public MobileElement lb_driverName1;

    @AndroidFindBy(accessibility = "0.533.542.33")
    @iOSXCUITFindBy(id = "0.533.542.33")
    public MobileElement btn_toggle1;

    @AndroidFindBy(accessibility = "274")
    @iOSXCUITFindBy(id = "274")
    public List<MobileElement> lb_containers;

    @AndroidFindBy(accessibility = "0.533.545")
    @iOSXCUITFindBy(id = "0.533.545")
    public MobileElement lb_leftover1;

    @AndroidFindBy(accessibility = "0.533.547")
    @iOSXCUITFindBy(id = "0.533.547")
    public MobileElement lb_packageLoad1;

    /////////////////////////////////////

    @AndroidFindBy(accessibility = "1.533.541")
    @iOSXCUITFindBy(id = "0.533.541")
    public MobileElement lb_driverName2;

    @AndroidFindBy(accessibility = "1.533.542.33")
    @iOSXCUITFindBy(id = "1.533.542.33")
    public MobileElement btn_toggle2;

    @AndroidFindBy(accessibility = "1.533.544")
    @iOSXCUITFindBy(id = "1.533.544")
    public MobileElement lb_leftover12;

    @AndroidFindBy(accessibility = "1.533.547")
    @iOSXCUITFindBy(id = "1.533.547")
    public MobileElement lb_packageLoad2;


}
