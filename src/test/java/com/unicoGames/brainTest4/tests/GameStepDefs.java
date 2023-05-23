package com.unicoGames.brainTest4.tests;

import com.unicoGames.brainTest4.pages.AllPages;
import com.unicoGames.brainTest4.utilities.DriverManager;
import com.unicoGames.brainTest4.utilities.ReusableMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.unicoGames.brainTest4.utilities.DriverManager.appiumDriver;


public class GameStepDefs extends TestBase {

    private static Logger LOG = LogManager.getLogger("GameStepDefs.class");
    AllPages allPages =new AllPages();
    @Test
    public void gamerCanTestTheGame() throws Exception {
        allPages.gamePages().buttonSettingsGamePlay().click();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonHome().click();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonSettings().click();
        ReusableMethods.waitForSecond(3);


        ReusableMethods.waitForSecond(1);
        allPages.gamePages().LanguageSelectButton().click();
        ReusableMethods.waitForSecond(3);
        List<String> languages = new ArrayList<>(); // Check the languages
        Arrays.stream(allPages.gamePages().LanguagesText()).forEach(x -> languages.add(x.getText()));
        System.out.println(languages);
        ReusableMethods.waitForSecond(1);


        allPages.gamePages().selectDeutsch().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().languageCloseButton().click();
        ReusableMethods.waitForSecond(1);


        String selected = allPages.gamePages().soundText().getText();
        Assert.assertEquals(selected, "TON");
        ReusableMethods.waitForSecond(1);


        String settingsTitle = allPages.gamePages().settingsTitle().getText();
        String soundText = allPages.gamePages().soundText().getText();
        String musicText = allPages.gamePages().musicText().getText();
        String notificationText = allPages.gamePages().notificationText().getText();
        String languageText = allPages.gamePages().languageText().getText();

        System.out.println("settingsTitle = " + settingsTitle);
        System.out.println("soundText = " + soundText);
        System.out.println("musicText = " + musicText);
        System.out.println("notificationText = " + notificationText);
        System.out.println("languageText = " + languageText);

        Assert.assertFalse(settingsTitle.isEmpty());
        Assert.assertFalse(soundText.isEmpty());
        Assert.assertFalse(musicText.isEmpty());
        Assert.assertFalse(notificationText.isEmpty());
        Assert.assertFalse(languageText.isEmpty());


        allPages.gamePages().support().click();
        ReusableMethods.waitForSecond(1);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);


        allPages.gamePages().ShareButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


        allPages.gamePages().twitterButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


        allPages.gamePages().TiktokButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


        allPages.gamePages().instagramButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


        allPages.gamePages().facebookButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


        allPages.gamePages().PrivacyPolicy().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


        allPages.gamePages().TermsOfUse().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


        allPages.gamePages().selectTurkish().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().languageCloseButton().click();
        ReusableMethods.waitForSecond(1);


        selected = allPages.gamePages().soundText().getText();
        Assert.assertEquals(selected, "SES");
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().backButton().click();


        allPages.gamePages().buttonCoin().click();
        ReusableMethods.waitForSecond(1);
        System.out.println("allPages.gamePages().shopTitle().getText() = " + allPages.gamePages().shopTitle().getText());
        // allPages.gamePages().removeAdsBut().click();
        // List<String> InAppButtons = new ArrayList<>(); // Check the languages
        //Arrays.stream(allPages.gamePages().getAllTitlesShop()).forEach(x-> InAppButtons.add(x.getText()));
        //System.out.println(InAppButtons);
        //ReusableMethods.waitForSecond(1);


        allPages.gamePages().buttonMoreOffers().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().backButtonShop().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().CloseButton().click();


        allPages.gamePages().customization().click();
        ReusableMethods.waitForSecond(2);


        allPages.gamePages().redCloth().click();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonBuy().click();
        ReusableMethods.waitForSecond(2);


        allPages.gamePages().buttonNext().click();
        ReusableMethods.waitForSecond(2);
        System.out.println("Dr.Worry : " + allPages.gamePages().lockedText().getText());
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonNext().click();
        ReusableMethods.waitForSecond(2);


        System.out.println("Jenny : " + allPages.gamePages().lockedText().getText());
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().cstmBackButton().click();
        ReusableMethods.waitForSecond(2);


        allPages.gamePages().Levels().click();
        ReusableMethods.waitForSecond(2);


        allPages.gamePages().nextPageLevels().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().nextPageLevels().click();
        ReusableMethods.waitForSecond(2);


        allPages.gamePages().nextPreviousPage().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().nextPreviousPage().click();
        ReusableMethods.waitForSecond(2);


        allPages.gamePages().levelButton().click();
        ReusableMethods.waitForSecond(2);


        allPages.gamePages().buttonHints().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonHintsPopup().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonHintsPopup().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonSkip().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().skipButtonPopup().click();
        ReusableMethods.waitForSecond(2);


        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonThumbsUp().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonThumbsDown().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonShare().click();
        ReusableMethods.waitForSecond(2);
        //   appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonRemoveAds().click();
        ReusableMethods.waitForSecond(2);
        //   appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonNext().click();
        String coinText = allPages.gamePages().coinText().getText();
        int coinNumber = Integer.parseInt(coinText);
        System.out.println(coinNumber);
        while (coinNumber > 25) {
            allPages.gamePages().buttonSkip().click();
            ReusableMethods.waitForSecond(3);
            allPages.gamePages().skipButtonPopup().click();
            ReusableMethods.waitForSecond(7);
            allPages.gamePages().buttonNext().click();
            String coinNumberText = allPages.gamePages().coinText().getText();
            coinNumber = Integer.parseInt(coinNumberText);

            allPages.gamePages().buttonRewarded().click();
            ReusableMethods.waitForSecond(7);
            if (!allPages.gamePages().buttonRewarded().isEnabled()) {
                String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
                String target = System.getProperty("user.dir") + File.separator + "test_output" + File.separator + "ScreenShots_" + date + ".png";
                new DriverManager().getAltDriver().getPNGScreenshot(target);
                ReusableMethods.killBrainTest3();
                ReusableMethods.waitForSecond(5);
            }

        }


    }
}
