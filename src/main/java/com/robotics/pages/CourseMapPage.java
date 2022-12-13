package com.robotics.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class CourseMapPage extends TitlePage {

    private ElementsCollection yearSwitchers = $$(".vc_tta-tab");

    public void yearShouldBeFollowing(String... titles) {
        yearSwitchers.should(texts(titles));
    }

    public void selectYear(String year) {
        yearSwitchers.findBy(text(year)).click();
    }
}
