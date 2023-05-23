package com.unicoGames.brainTest4.tests;

import com.alttester.AltDriver;
import com.alttester.AltPortForwarding;
import com.unicoGames.brainTest4.utilities.DriverManager;
import com.unicoGames.brainTest4.utilities.ServerManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestBase {
    @Parameters({"platformName", "driverType"})
    @BeforeClass
    public void setUp(@Optional("Android") String platformName, @Optional("appiumAndAltDriver") String driverType) throws IOException, InterruptedException, MalformedURLException {//, @Optional("googleplay") String marketName) throws IOException, InterruptedException { //, @Optional("DE21D") String environment) {
        // GlobalParams.setMarketName(marketName);
        // GlobalParams.setEnvironment(environment);
        //  ReusableMethods.clientLoginRequest();
        // System.out.println(GlobalParams.getActiveOffers());
        if (driverType.equals("appiumAndAltDriver")) {
            //ReusableMethods.installAndRunZulaMobile();
            // ReusableMethods.runBrainTest3();
            // altDriver    appiumAndAltDriver
            new DriverManager().initializeDriver(platformName, driverType);
        } else {
            new ServerManager().startServer();
            new DriverManager().initializeDriver(platformName, driverType);
        }
    }
    AltDriver altDriver;
    @BeforeTest
    public void setUp(){
        AltPortForwarding.forwardAndroid();
        altDriver = new DriverManager().getAltDriver();
    }
}
