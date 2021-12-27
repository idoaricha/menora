package sanity;



import com.google.gson.internal.bind.util.ISO8601Utils;
import extensions.MobileActions;
import extensions.Verifications_Mobile;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.ManagePages;
import workflows.MobileFlows;
import java.io.IOException;



@Listeners(utilities.Listeners.class)
public class MenoraMobile_Onboarding extends CommonOps
{

    @BeforeClass
    public void startSession () throws IOException {
        int port = findAvailableAppiumPort();
        //System.setProperty("udid", "520066cce22f1581");
        //System.setProperty("emulator", "false");
        //System.setProperty("runPlatform", "Android");
        //System.setProperty("name", "SM-J701F");

        //System.setProperty("udid", "ce051605bd453d2502");
        //System.setProperty("emulator", "false");
        //System.setProperty("runPlatform", "Android");
        //System.setProperty("name", "SM-G930F");

        //mvn -Dudid=00008020-001405841E3A002E -Demulator=false -DrunPlatform=ios -Dname=iPhone_XR -Pmobile test

        System.setProperty("udid", "39f46ef5");
        System.setProperty("emulator", "false");
        System.setProperty("runPlatform", "Android");
        System.setProperty("name", "LE2113");

        if (port == -1) {
            System.out.println("can't find available port. terminating run....");
            System.exit(0); //exit the run if no port is available
        }
        service = startAppium(port); //start the server
        if (System.getProperty("runPlatform").trim().equalsIgnoreCase("ios")) { //get from jenkins
                 iosDriver = initMobileIOS(port);
                if (iosDriver == null) {
                    System.out.println("Fail To Initialize Appium.");
                    closeAppium();
                    System.exit(0);
                }
                iosDriver.resetApp();
                mobileDriver = iosDriver;

        }
        else { //android
            androidDriver = initMobileAndroid(port);
            if (androidDriver == null) {
                System.out.println("Fail To Initialize Appium.");
                closeAppium();
                System.exit(0);
            }
            mobileDriver = androidDriver;
        }
        ManagePages.initMenoraHW();
    }


    @Test(description = "test01 - check visibility",priority = 1)
    @Description("this test check visibility of onboarding screen")
    public void test_1() throws InterruptedException { //H1
       Verifications_Mobile.WaitForElement(MenoraHW_intro.lb_goToApp,10);
       Verifications_Mobile.verifyTextInElement(MenoraHW_intro.lb_goToApp,"קדימה להרשמה");
    }

    @Test(description = "test02 - add a new candidate",priority = 2)
    @Description("this test adds a new candidate to CSV file")
    public void test_2()  { //H4
        //MobileActions.takeScreenshot("H4");
        //MobileFlows.previous_screen_swipe();
        Verifications_Mobile.existenceOfElement(MenoraHW_intro.btn_goToApp);
        System.out.println(mobileDriver.getPageSource());
        MobileActions.Click(MenoraHW_intro.btn_goToApp);
        if (System.getProperty("runPlatform").trim().equalsIgnoreCase("ios")) {
            ////ios-system popup
            mobileDriver.findElement(By.xpath("//XCUIElementTypeButton[2]")).click(); //allow
            //XCUIElementTypeButton[1] //cancel
        }
    }



/*
    @Test(description = "testing screen we got a problem")
    public void test_4() { //L1_L4_L5
        MobileActions.WifiOFF();
        MobileActions.Click(MenoraHW_connection.btn_b2c);
        Verifications_Mobile.WaitForElement(menoraHW_somethingWrong.lb_paragraph,10);
        MobileActions.takeScreenshot("SomethingWrong");
        MobileActions.Click(menoraHW_somethingWrong.btn_x);
        Verifications_Mobile.WaitForElement(MenoraHW_connection.lb_home,10);
        //MobileActions.Click(MenoraHW_connection.btn_b2c);
        //Verifications_Mobile.WaitForElement(menoraHW_somethingWrong.lb_paragraph,10);
        //MobileActions.Click(menoraHW_somethingWrong.btn_chat);
        //Verifications_Mobile.WaitForElement(menoraHW_offline.lb_paragraph,10);
        //MobileActions.takeScreenshot("Offline");
        //MobileActions.Click(menoraHW_offline.btn_x);
        MobileActions.WifiON();
        //Verifications_Mobile.WaitForElement(MenoraHW_connection.lb_home,10);

        //MobileActions.Click(MenoraHW_connection.btn_b2c);
        //Verifications_Mobile.existenceOfElement(menoraHW_somethingWrong.lb_paragraph);
        //MobileActions.Click(menoraHW_somethingWrong.btn_chat);
        //Verifications_Mobile.existenceOfElement(menoraHW_offline.btn_tryAgain);

        //MobileActions.Click(menoraHW_offline.btn_tryAgain); //STALE ELEMENT
        //Verifications_Mobile.existenceOfElement(menoraHW_offline.btn_tryAgain);
        //System.out.println("wifi_on");

        //MobileActions.Click(menoraHW_offline.btn_tryAgain);
        //Verifications_Mobile.existenceOfElement(MenoraHW_connection.lb_home);
        //Thread.sleep(3800); //WAIT FOR THE DIALER TO APPEAR
        //androidDriver.activateApp("com.android.phone");
        //System.out.println(androidDriver.findElement(By.xpath("//*[@id='digis']")).getText());
        //androidDriver.activateApp("com.menora_myway.test"); //return to the app from dial
    }
 */

    @Test(priority = 3)
    public void test_3()  { //I3_L6
        Verifications_Mobile.WaitForWebview(15);
        MobileFlows.previous_screen_swipe();
        try {
            Verifications_Mobile.WaitForElement(mobileDriver.findElement(By.xpath("//*[@id='idNumber']")), 10);
        }catch(Exception e) {
            System.out.println("error occurred: " + e);
        }
        MobileFlows.login(users.get(0).get(1), users.get(0).get(2),true);

    }

    @Test(description = "test01 - add a new candidate",priority = 4)
    @Description("this test adds a new candidate to CSV file")
    public void test_4() throws InterruptedException, IOException { //N1_N4_N5_N6
        Verifications_Mobile.WaitForElement(MenoraHW_permistionAsk.lb_title,20);
        //MobileActions.takeScreenshot("N1");
        MobileFlows.previous_screen_swipe();
        //killProcess("chromedriver");
        Verifications_Mobile.existenceOfElement(MenoraHW_permistionAsk.lb_title);
        MobileActions.Click(MenoraHW_permistionAsk.btn_continue);
        if (System.getProperty("runPlatform").trim().equalsIgnoreCase("ios")) {
            ////ios-system popup
            mobileDriver.findElement(By.xpath("//XCUIElementTypeButton[2]")).click(); //fitness
            mobileDriver.findElement(By.xpath("//XCUIElementTypeButton[2]")).click(); //bluetooth
            mobileDriver.findElement(By.xpath("//XCUIElementTypeButton[2]")).click(); //location allow while using the app , [3] don't allow
            mobileDriver.findElement(By.xpath("//XCUIElementTypeButton[2]")).click(); // mikum system settings
            //XCUIElementTypeButton[1] //cancel
        }
         else { // android
            Verifications_Mobile.WaitForElement(mobileDriver.findElement(By.xpath("//*[@class='android.widget.Button']")), 10);
            mobileDriver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).click(); //activity
            Thread.sleep(100);
            mobileDriver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).click(); //location
            Verifications_Mobile.WaitForElement(MenoraHW_LocationPopup.lb_para, 10);
            MobileActions.Click(MenoraHW_LocationPopup.btn_ok);
            Verifications_Mobile.WaitForElement(mobileDriver.findElement(By.id("com.android.permissioncontroller:id/allow_always_radio_button")), 10);
            mobileDriver.findElement(By.id("com.android.permissioncontroller:id/allow_always_radio_button")).click(); //all the time
            mobileDriver.activateApp("com.menora_myway.test");
            mobileDriver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click(); //battery management
            MobileActions.Click(MenoraHW_LocationHaveToAccept.btn_approveLocation);
            mobileDriver.activateApp("com.menora_myway.test");
            //Verifications_Mobile.WaitForElement(MenoraHW_BTWelcome.lb_title,10);
            //MobileFlows.previous_screen_swipe();
            //MobileActions.Click(MenoraHW_BTWelcome.btn_skip);
            double starttime = System.nanoTime();
            wait.until(ExpectedConditions.visibilityOf(MenoraHW_gotIt.lb_title));
            double endtime = System.nanoTime();
            System.out.println("got it time is : " + (endtime - starttime));
            Verifications_Mobile.WaitForElement(MenoraHW_Home.lb_containerTitle,10);

        }
    }
    /*
        @Test(description = "test01 - add a new candidate",priority = 5)
        @Description("this test adds a new candidate to CSV file")
        public void test_5() throws InterruptedException { //AB1_AB4
            //Verifications_Mobile.WaitForElement(MenoraHW_BTWelcome.lb_title,10);
            //MobileFlows.previous_screen_swipe();
            //MobileActions.Click(MenoraHW_BTWelcome.btn_skip);

        }

            @Test(priority = 6)
            public void test_6()  { //ab1 , ab4
                MobileActions.taoOnScreen(120,2120); //todo: replace with element instead of coordinates
                Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title,10);
                MobileFlows.previous_screen_swipe();
                Verifications_Mobile.existenceOfElement(MenoraHW_Actions.lb_title);
            }

            @Test(priority = 7)
            public void test_7() throws InterruptedException { //ac1, ac5,ac6 , ac8 , ac9
                MobileActions.taoOnScreen(120,2120); //todo: replace with element instead of coordinates
                Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title,10);
                MobileActions.Click(MenoraHW_Actions.btn_userInfo);
                Verifications_Mobile.WaitForElement(MenoraHW_Profile.lb_name,10);
                MobileFlows.previous_screen_swipe();
                Verifications_Mobile.existenceOfElement(MenoraHW_Profile.lb_name);
                String nickname = MobileActions.ReturnElementText(MenoraHW_Profile.txt_nickName).trim();
                MobileActions.Click(MenoraHW_Profile.btn_editNick);
                Thread.sleep(500); //wait for keyboard to open
                Assert.assertTrue(androidDriver.isKeyboardShown());
                MobileActions.SendText(MenoraHW_Profile.txt_nickName,"");
                MobileActions.tapOnElement(MenoraHW_Profile.lb_name);
                Assert.assertEquals(MenoraHW_Profile.txt_nickName.getText().trim(),nickname);
                MobileActions.Click(MenoraHW_Profile.btn_editNick);
                MobileActions.SendText(MenoraHW_Profile.txt_nickName," ");
                MobileActions.tapOnElement(MenoraHW_Profile.lb_name);
                Assert.assertEquals(MenoraHW_Profile.txt_nickName.getText().trim(),nickname);
                MobileActions.Click(MenoraHW_Profile.btn_editNick);
                MobileActions.SendText(MenoraHW_Profile.txt_nickName,"כינוי");
                MobileActions.tapOnElement(MenoraHW_Profile.lb_name);
                nickname = "כינוי";
                Assert.assertEquals(MenoraHW_Profile.txt_nickName.getText().trim(),nickname);
                MobileActions.Click(MenoraHW_Profile.btn_back);
                Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title,10);
                MobileActions.Click(MenoraHW_Actions.btn_userInfo);
                Verifications_Mobile.WaitForElement(MenoraHW_Profile.lb_name,10);
                Assert.assertEquals(nickname,MenoraHW_Profile.txt_nickName.getText());
                //todo: replace with element instead of coordinates
                MobileActions.taoOnScreen(mobileDriver.manage().window().getSize().width - 100,1800); //home button
            }



            //independence test from here from home screen
            @Test(priority = 8)
            public void test_8(){ //ac19
                MobileActions.taoOnScreen(120,2120); //todo: replace with element instead of coordinates
                Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title,10);
                MobileActions.Click(MenoraHW_Actions.btn_userInfo);
                Verifications_Mobile.WaitForElement(MenoraHW_Profile.btn_addPicture ,10);
                MobileActions.Click(MenoraHW_Profile.btn_addPicture);
                Verifications_Mobile.existenceOfElement(MenoraHW_AddProfilePicture.btn_camera);
                Verifications_Mobile.existenceOfElement(MenoraHW_AddProfilePicture.btn_gallery);
                MobileActions.taoOnScreen(MenoraHW_AddProfilePicture.btn_camera.getCenter().x ,MenoraHW_AddProfilePicture.btn_camera.getLocation().y - 100);
                MobileActions.Click(MenoraHW_Profile.btn_back);
          }
        /*
        @Test (priority = 9)
        public void test_9() {
            MobileActions.taoOnScreen(120, 2120); //todo: replace with element instead of coordinates
            Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title, 10);
            MobileActions.Click(MenoraHW_Actions.btn_CustomerService);
            Verifications_Mobile.WaitForElement(MenoraHW_CustomerService.lb_customerService, 5);
            MobileActions.Click(MenoraHW_CustomerService.btn_claims);
            Verifications_Mobile.WaitForElement(MenoraHW_CustomerServiceClosed.lb_lowerTitle, 5);
            //MobileActions.Click(MenoraHW_CustomerServiceClosed.btn_CallMeBack);
        }


            @Test (priority = 10)
            public void test_10() {
                MobileActions.taoOnScreen(120, 2120); //todo: replace with element instead of coordinates
                Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title, 10);
                MobileActions.Click(MenoraHW_Actions.btn_CustomerService);
                Verifications_Mobile.WaitForElement(MenoraHW_CustomerService.lb_customerService, 5);
                MobileFlows.previous_screen_swipe();
                Verifications_Mobile.existenceOfElement(MenoraHW_CustomerService.lb_customerService);
                MobileActions.Click(MenoraHW_CustomerService.btn_back);
                Verifications_Mobile.existenceOfElement(MenoraHW_Actions.lb_title);
                MobileActions.Click(MenoraHW_Actions.btn_CustomerService);
                Verifications_Mobile.existenceOfElement(MenoraHW_CustomerService.lb_customerService);
                MobileActions.Click(MenoraHW_Actions.btn_CustomerService);
                MobileActions.Click(MenoraHW_CustomerService.btn_customerService);
                Verifications_Mobile.WaitForElement(MenoraHW_CustomerServiceClosed.lb_lowerTitle, 5);
                MobileFlows.previous_screen_swipe();
                Verifications_Mobile.existenceOfElement(MenoraHW_CustomerServiceClosed.lb_lowerTitle);
                //MobileActions.Click(MenoraHW_CustomerServiceClosed.btn_CallMeBack);
                MobileActions.Click(MenoraHW_CustomerServiceClosed.btn_back);
                Verifications_Mobile.existenceOfElement(MenoraHW_CustomerService.lb_customerService);
                /////////////////
                MobileActions.scrollTotext("רוצה לבדוק ב״שאלות ותשובות״");
                MobileActions.Click(MenoraHW_CustomerService.btn_QnA);
                Verifications_Mobile.WaitForElement(MenoraHW_QnA.btn_Q1, 5);
            }


           @Test(priority =11 )
           public void test_11() throws InterruptedException {
               MobileActions.taoOnScreen(120,2120); //todo: replace with element instead of coordinates
               Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title,10);
               MobileActions.scrollTotext("התראות"); //todo : get text
               MobileActions.Click(MenoraHW_Actions.btn_notification);
               Verifications_Mobile.WaitForElement(MenoraHW_Notifications.lb_startDrive ,10);
               MobileFlows.previous_screen_swipe();
               Verifications_Mobile.existenceOfElement(MenoraHW_Notifications.lb_startDrive);
               ////////
               MobileActions.Click(MenoraHW_Notifications.btn_back);
               Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title,10);
           }

        @Test (priority = 12)
        public void test_12(){
            MobileActions.taoOnScreen(120,2120); //todo: replace with element instead of coordinates
            Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_title,10);
            MobileActions.scrollTotext("טעינת חבילה אוטומטית"); //todo : road service title
            MobileActions.Click(MenoraHW_Actions.btn_packageAutoLoad);
            Verifications_Mobile.WaitForElement(MenoraHW_AutoRenewal.lb_para,5);
            MobileFlows.previous_screen_swipe();
            Verifications_Mobile.existenceOfElement(MenoraHW_AutoRenewal.lb_para);
            MobileActions.Click(MenoraHW_AutoRenewal.btn_back);
            Verifications_Mobile.existenceOfElement(MenoraHW_Actions.lb_title);
        }



         @Test(priority =13 )
         public void test_13() throws  InterruptedException {
             MobileActions.doubleTaoOnScreen(120,2120); //todo: replace with element instead of coordinates
             MobileActions.scrollTotext("שירותי דרך"); //todo : road service title
             MobileActions.Click(MenoraHW_Actions.btn_roadServices);
             Verifications_Mobile.WaitForElement(MenoraHW_RoadServices.lb_windshieldTitle,30);
             MobileFlows.previous_screen_swipe();
             Verifications_Mobile.existenceOfElement(MenoraHW_RoadServices.lb_windshieldTitle);
             //MobileActions.scrollTotext("*3155");
             String phoneNum = MenoraHW_RoadServices.lb_btn_windshieldTitle.getText().trim();
             String elem = "com.google.android.dialer:id/digits";
             MobileActions.Click(MenoraHW_RoadServices.btn_windshieldTitle);
             //System.out.println(mobileDriver.getPageSource());
             //Verifications_Mobile.WaitForElement(mobileDriver.findElement(By.id("com.samsung.android.contacts:id/digits")),10);
             Verifications_Mobile.WaitForElement(mobileDriver.findElement(By.id(elem)),10);
             Assert.assertEquals(mobileDriver.findElement(By.id(elem)).getText(),phoneNum);
             mobileDriver.activateApp("com.menora_myway.test");

             /*
             //MobileActions.scrollTotext(MenoraHW_RoadServices.lb_btn_towing.toString().split(":")[1].replace("})","").trim());
             MobileActions.Click(MenoraHW_RoadServices.btn_towing);
             Verifications_Mobile.WaitForElement(mobileDriver.findElement(By.id(elem)),10);
             Assert.assertEquals(mobileDriver.findElement(By.id(elem)).getText(),MenoraHW_RoadServices.lb_btn_towing.getText());
             mobileDriver.activateApp("com.menora_myway.test");

             //MobileActions.scrollToElement(MenoraHW_RoadServices.lb_btn_subCar.toString().split(":")[1].replace("})","").trim());
             MobileActions.Click(MenoraHW_RoadServices.btn_subCar);
             Verifications_Mobile.WaitForElement(mobileDriver.findElement(By.id(elem)),10);
             Assert.assertEquals(mobileDriver.findElement(By.id(elem)).getText(),MenoraHW_RoadServices.lb_btn_subCar.getText());
             mobileDriver.activateApp("com.menora_myway.test");

         }
 */
/*
        @Test (priority = 14)
        public void test_14() throws InterruptedException {
            MobileActions.doubleTaoOnScreen(120, 2120); //todo: replace with element instead of coordinates
            MobileActions.scrollTotext("צפיה במסמכי הפוליסה"); //todo : road service title
            MobileActions.Click(MenoraHW_Actions.btn_watchPolicy);
            Verifications_Mobile.existenceOfElement(MenoraHW_ViewPolicy.lb_carNumber);
            //MobileFlows.previous_screen_swipe();
            //Verifications_Mobile.existenceOfElement(MenoraHW_ViewPolicy.lb_carNumber);
            String carnum = MenoraHW_ViewPolicy.lb_carNumber.getText();
            MobileActions.Click(MenoraHW_ViewPolicy.btn_packageSelect);
            Verifications_Mobile.WaitForElement(MenoraHW_MenuCarPolicy.btn_car1, 5);
            //MobileFlows.previous_screen_swipe();
            //Verifications_Mobile.existenceOfElement(MenoraHW_MenuCarPolicy.btn_car1);
            MobileActions.taoOnScreen(MenoraHW_MenuCarPolicy.btn_car1.getCenter().x, MenoraHW_MenuCarPolicy.btn_car1.getLocation().y - 100);
            Verifications_Mobile.verifyTextInElement(MenoraHW_ViewPolicy.lb_carNumber, carnum);
            MobileActions.Click(MenoraHW_ViewPolicy.btn_packageSelect); //todo : change to loop bellow
            Verifications_Mobile.WaitForElement(MenoraHW_MenuCarPolicy.btn_car1, 5);
            carnum= MenoraHW_MenuCarPolicy.lb_car2.getText();
            MobileActions.Click(MenoraHW_MenuCarPolicy.btn_car2); //todo : change to loop bellow
            Verifications_Mobile.WaitForElement(MenoraHW_ViewPolicy.lb_carNumber, 5);
            Verifications_Mobile.verifyTextInElement(MenoraHW_ViewPolicy.lb_carNumber, carnum);
            // for (int i = 0; i <= cars.size(); i++) {
             //   if (cars.get(i).getText() != carnum)
              //      MobileActions.Click(MenoraHW_MenuCarPolicy.cars.get(i));
           // }

        }

    @Test (priority = 15)
    public void test_15() {
        MobileActions.doubleTaoOnScreen(120, 2120); //todo: replace with element instead of coordinates
        MobileActions.scrollTotext("שאלות ותשובות"); //todo : road service title
        MobileActions.Click(MenoraHW_Actions.btn_faq);
        Verifications_Mobile.WaitForElement(MenoraHW_QnA.lb_lowerTitle, 5);
        MobileFlows.previous_screen_swipe();
        Verifications_Mobile.existenceOfElement(MenoraHW_QnA.lb_title);
        MobileActions.scrollTotext("דברו איתנו");
        MobileActions.Click(MenoraHW_QnA.btn_contact);
        Verifications_Mobile.WaitForElement(MenoraHW_CustomerService.lb_title, 5);
        MobileActions.Click(MenoraHW_CustomerService.btn_back);
        Verifications_Mobile.existenceOfElement(MenoraHW_QnA.lb_title);
        MobileActions.Click(MenoraHW_QnA.btn_back);
        Verifications_Mobile.existenceOfElement(MenoraHW_Actions.lb_aboutTitle);
    }

        @Test (priority = 16)
        public void test_16() {
            MobileActions.doubleTaoOnScreen(350, 2120); //todo: replace with element instead of coordinates
            Verifications_Mobile.WaitForElement(MenoraHW_Insurance.lb_title, 10);
            MobileFlows.previous_screen_swipe();
            Verifications_Mobile.existenceOfElement(MenoraHW_Insurance.lb_title);
            MobileActions.Click(MenoraHW_Insurance.btn_watchPolicy);
            Verifications_Mobile.WaitForElement(MenoraHW_ViewPolicy.lb_insuranceDetails, 10);
            MobileActions.Click(MenoraHW_ViewPolicy.btn_back);
            MobileFlows.insurance_car_swipe(true,MenoraHW_Insurance.lb_insuranceValidity1);
            MobileFlows.checkPackageTitle(MenoraHW_Insurance.lb_driverName1.getText().trim());
        }
*/
        @Test (priority = 17)
        public void test_17() {
            MobileActions.doubleTaoOnScreen(120, 2120); //todo: replace with element instead of coordinates
            MobileActions.scrollTotext("טעינת החבילה"); //todo
            MobileActions.Click(MenoraHW_Actions.btn_packageLoad);
            Verifications_Mobile.WaitForElement(MenoraHW_LoadPackage.lb_topLabel, 5);
            MobileFlows.previous_screen_swipe();
            Verifications_Mobile.existenceOfElement(MenoraHW_LoadPackage.lb_topLabel);
            MobileActions.Click(MenoraHW_LoadPackage.btn_back);
            Verifications_Mobile.WaitForElement(MenoraHW_Actions.lb_policy, 10);
            MobileActions.Click(MenoraHW_Actions.btn_packageLoad);
            Verifications_Mobile.WaitForElement(MenoraHW_LoadPackage.lb_topLabel, 5);
            MobileActions.scrollTotext("מספר תשלומים");
            Assert.assertEquals(MenoraHW_LoadPackage.lb_paymentsAmount.getText(),"תשלום אחד");
            MobileActions.Click(MenoraHW_LoadPackage.btn_payment);
            Verifications_Mobile.WaitForElement(MenoraHW_Payments.lb_title, 10);
            MobileFlows.previous_screen_swipe();
            Verifications_Mobile.existenceOfElement(MenoraHW_Payments.lb_title);
            MobileActions.Click(MenoraHW_Payments.btn_back);
            Verifications_Mobile.existenceOfElement(MenoraHW_LoadPackage.lb_payments);
            MobileActions.Click(MenoraHW_LoadPackage.btn_payment);
            Assert.assertEquals(MenoraHW_Payments.lb_payment.getText(),"1");
            String currentPayment = "";
            String startPayment = "";
            int count = 1;
            do  {
                startPayment = MenoraHW_Payments.lb_payment.getText();
                MobileActions.Click(MenoraHW_Payments.btn_up);
                if (currentPayment != startPayment) count++ ;
                if (count == 1) {
                    softAssert.assertFalse(MenoraHW_Payments.lb_intrest.isDisplayed());
                    softAssert.assertFalse(MenoraHW_Payments.lb_howManyInEach.isDisplayed());
                    softAssert.assertFalse(MenoraHW_Payments.lb_totalPayment.isDisplayed());
                }else if (count > 1 && count < 4) {
                    softAssert.assertTrue(MenoraHW_Payments.lb_howManyInEach.isDisplayed());
                    softAssert.assertTrue(MenoraHW_Payments.lb_totalPayment.isDisplayed());
                    softAssert.assertTrue(MenoraHW_Payments.lb_intrest.isDisplayed());
                    softAssert.assertEquals(MenoraHW_Payments.lb_intrest.getText(),"ללא ריבית והצמדה");
                }else if (count == 4) {
                    softAssert.assertTrue(MenoraHW_Payments.lb_howManyInEach.isDisplayed());
                    softAssert.assertTrue(MenoraHW_Payments.lb_totalPayment.isDisplayed());
                    softAssert.assertTrue(MenoraHW_Payments.lb_intrest.isDisplayed());
                    softAssert.assertEquals(MenoraHW_Payments.lb_intrest.getText(),"כולל דמי אשראי");
                } else {
                    softAssert.assertTrue(MenoraHW_Payments.lb_howManyInEach.isDisplayed());
                    softAssert.assertTrue(MenoraHW_Payments.lb_totalPayment.isDisplayed());
                    softAssert.assertTrue(MenoraHW_Payments.lb_intrest.isDisplayed());
                    softAssert.assertEquals(MenoraHW_Payments.lb_intrest.getText(),"כולל דמי אשראי בתוספת הצמדה");
                }
                currentPayment= MenoraHW_Payments.lb_payment.getText();
            } while (currentPayment != startPayment);
            MobileActions.scrollTotext(MenoraHW_Payments.lb_update.getText());
            MobileActions.Click(MenoraHW_Payments.btn_update);
            Verifications_Mobile.existenceOfElement(MenoraHW_LoadPackage.lb_payments);
            Assert.assertEquals(MenoraHW_LoadPackage.lb_payments.getText().split(" ")[0].trim(),count);
        }

    @Test (priority = 18)
    public void test_18() throws InterruptedException {
        MobileActions.doubleTaoOnScreen(120, 2120); //todo: replace with element instead of coordinates
        MobileActions.scrollTotext("טעינת החבילה"); //todo : road service title
        MobileActions.Click(MenoraHW_Actions.btn_packageLoad);
        Verifications_Mobile.WaitForElement(MenoraHW_LoadPackage.lb_packageLabel, 5);
        MobileActions.scrollTotext("אמצעי תשלום");
        MobileActions.Click(MenoraHW_LoadPackage.btn_creditCard);
        Verifications_Mobile.existenceOfElement(MenoraHW_CreditCardEdit.lb_title);
        MobileFlows.previous_screen_swipe();
        Verifications_Mobile.existenceOfElement(MenoraHW_CreditCardEdit.lb_title);
        MobileActions.Click(MenoraHW_CreditCardEdit.btn_back);
        Verifications_Mobile.existenceOfElement(MenoraHW_LoadPackage.lb_creditCard);
        MobileActions.Click(MenoraHW_LoadPackage.btn_creditCard);
        Verifications_Mobile.existenceOfElement(MenoraHW_CreditCardEdit.lb_title);
        MobileActions.Click(MenoraHW_CreditCardEdit.txt_name);
        Thread.sleep(500); //wait for keyboard to open
        Assert.assertTrue(androidDriver.isKeyboardShown());
        MobileActions.SendText(MenoraHW_CreditCardEdit.txt_name,"");
        MobileActions.Click(MenoraHW_CreditCardEdit.txt_id);
        Assert.assertTrue(MenoraHW_CreditCardEdit.lb_name_warning.isDisplayed());
        MobileActions.SendText(MenoraHW_CreditCardEdit.txt_name,"1234");
        MobileActions.Click(MenoraHW_CreditCardEdit.txt_id);
        Assert.assertTrue(MenoraHW_CreditCardEdit.lb_name_warning.isDisplayed());
        MobileActions.SendText(MenoraHW_CreditCardEdit.txt_name,"abc123");
        MobileActions.Click(MenoraHW_CreditCardEdit.txt_id);
        Assert.assertTrue(MenoraHW_CreditCardEdit.lb_name_warning.isDisplayed());
        MobileActions.SendText(MenoraHW_CreditCardEdit.txt_name,"abc!");
        MobileActions.Click(MenoraHW_CreditCardEdit.txt_id);
        Assert.assertTrue(MenoraHW_CreditCardEdit.lb_name_warning.isDisplayed());
        MobileActions.SendText(MenoraHW_CreditCardEdit.txt_name,"!!!");
        MobileActions.Click(MenoraHW_CreditCardEdit.txt_id);
        Assert.assertTrue(MenoraHW_CreditCardEdit.lb_name_warning.isDisplayed());
        MobileActions.SendText(MenoraHW_CreditCardEdit.txt_name,"Danny Levi");
        MobileActions.Click(MenoraHW_CreditCardEdit.txt_id);
        Assert.assertFalse(MenoraHW_CreditCardEdit.lb_name_warning.isDisplayed());
    }

    @AfterClass
    public void end_session() {
        closeAppium();
    }


}
