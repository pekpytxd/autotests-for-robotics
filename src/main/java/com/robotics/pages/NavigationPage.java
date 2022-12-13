package com.robotics.pages;

import static com.codeborne.selenide.Selenide.*;

public class NavigationPage {

    public void switchToTab(String tab) {
        switchTo().window(tab);
    }

    public void scroll(int pos) throws InterruptedException {
        for (int i = 0; i < pos; i += 1) {
            executeJavaScript("scrollBy(0, " + i + ")");
            Thread.sleep(150);
        }
    }
}
