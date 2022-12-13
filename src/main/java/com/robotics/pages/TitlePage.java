package com.robotics.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TitlePage {

    private final SelenideElement titleElement = $(".page-title-title");

    public void titleShouldBeVisible() {
        titleElement.shouldBe(visible);
    }

    public void titleShouldBeFollowing(String title) {
        titleElement.shouldBe(text(title));
    }
}
