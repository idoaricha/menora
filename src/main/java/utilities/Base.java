package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pageObjects.Menora_HW.PermisionAsk;

import java.util.ArrayList;
import java.util.Properties;

public class Base {

    //general
    public static WebDriverWait wait;
    protected static SoftAssert softAssert ;
    protected static  ArrayList<ArrayList<String>> users;
    //protected static Screen screen;  //for sixuli graphical identifier
    protected static String platform ;
    protected static Properties prop; //for properites config file

    //mobile
    public static AppiumDriver mobileDriver;
    public static IOSDriver iosDriver;
    public static AndroidDriver androidDriver;
    public static AppiumDriverLocalService service; //close and open the appium session


    //page objects - mobile
    public static pageObjects.Menora_HW.IntroScreen MenoraHW_intro;
    public static pageObjects.Menora_HW.HomeTabMain MenoraHW_activities;
    public static PermisionAsk MenoraHW_permistionAsk;
    public static pageObjects.Menora_HW.LocationReject MenoraHW_LocationReject;
    public static pageObjects.Menora_HW.GotItScreen MenoraHW_gotIt;
    public static pageObjects.Menora_HW.SomethingWrong menoraHW_somethingWrong;
    public static pageObjects.Menora_HW.Offline menoraHW_offline;
    public static pageObjects.Menora_HW.BluetoothWelcome MenoraHW_BTWelcome;
    public static pageObjects.Menora_HW.HomeTabMain MenoraHW_Home;
    public static pageObjects.Menora_HW.ActionsTabMain MenoraHW_Actions;
    public static pageObjects.Menora_HW.UserProfile MenoraHW_Profile;
    public static pageObjects.Menora_HW.MenuAddProfilePicture MenoraHW_AddProfilePicture;
    public static pageObjects.Menora_HW.RoadServices MenoraHW_RoadServices ;
    public static pageObjects.Menora_HW.Notifications MenoraHW_Notifications ;
    public static pageObjects.Menora_HW.AutoRenewalPackage MenoraHW_AutoRenewal ;
    public static pageObjects.Menora_HW.ViewPolicyDocuments MenoraHW_ViewPolicy ;
    public static pageObjects.Menora_HW.MenuWatchPolicyCarSelect MenoraHW_MenuCarPolicy ;
    public static pageObjects.Menora_HW.QnA MenoraHW_QnA ;
    public static pageObjects.Menora_HW.CustomerService MenoraHW_CustomerService ;
    public static pageObjects.Menora_HW.CustomerServiceClosed MenoraHW_CustomerServiceClosed ;
    public static pageObjects.Menora_HW.InsuranceTabMain MenoraHW_Insurance ;
    public static pageObjects.Menora_HW.LoadPackage MenoraHW_LoadPackage ;
    public static pageObjects.Menora_HW.LoadPackageCreditCardEdit MenoraHW_CreditCardEdit ;
    public static pageObjects.Menora_HW.LoadPackagePayments MenoraHW_Payments ;
    public static pageObjects.Menora_HW.LoadPackageUpdatedCredit MenoraHW_UpdatedCredit ;
    public static pageObjects.Menora_HW.LocationPleaseAllowPopup MenoraHW_LocationPopup ;
    public static pageObjects.Menora_HW.LocationHaveToAccept MenoraHW_LocationHaveToAccept ;


    //webview



    //Rest API
    //protected static RequestSpecification httpRequest;
    //protected static Response response;
    //protected static JSONObject params = new JSONObject();
    //protected static JsonPath jp;


    //Database
    //protected static Connection con;
    // protected static Statement stat;
    //protected static ResultSet rs;




}
