package com.robotics.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class AboutPage extends TitlePage {

    public void openInYoutube() {
        $(".ytp-impression-link").click();
    }

    public void clickOnPlayButtonInYoutubeTab() throws InterruptedException {
        switchTo().frame($(".sc-wrapbox-element"));
        $(".ytp-large-play-button").click();
        Thread.sleep(73000);
        switchTo().window(0);
    }
}
