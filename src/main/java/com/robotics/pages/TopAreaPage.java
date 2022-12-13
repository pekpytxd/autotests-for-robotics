package com.robotics.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TopAreaPage {

    private final SelenideElement topAreaElement = $("#top-area");
    private final SelenideElement facebookElement = $(".socials-item.facebook");
    private final ElementsCollection contactsElement = $$(".sc-contacts-item");

    public void shouldBeVisible() {
        topAreaElement.shouldBe(visible);
    }

    public void contactsShouldBeFollowing(String... contacts) {
        contactsElement.should(texts(contacts));
    }

    public void facebookIconShouldBeVisible() {
        facebookElement.shouldBe(visible);
    }

    public void clickOnFacebookIcon() {
        facebookElement.click();
    }
}
