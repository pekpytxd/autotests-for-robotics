package com.robotics.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HeaderPage {

    private final SelenideElement headerElement = $(".header-main");

    public void shouldBeVisible() {
        headerElement.shouldBe(visible);
    }

    public void clickOnRobotIcon() {
        $(".site-logo").click();
    }

    public void clickOnButton(String buttonName) {
        $x("//a[contains(text(), '" + buttonName + "')]").click();
    }

    public void hoverOnButton(String buttonName) {
        $x("//a[contains(text(), '" + buttonName + "')]").hover();
    }
}
