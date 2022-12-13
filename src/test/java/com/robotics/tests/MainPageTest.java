package com.robotics.tests;

import com.robotics.BaseTest;
import com.robotics.pages.*;
import org.junit.jupiter.api.Test;

public class MainPageTest extends BaseTest {

    private final TopAreaPage topArea = new TopAreaPage();
    private final HeaderPage headerPage = new HeaderPage();
    private final AboutPage aboutPage = new AboutPage();
    private final WhyRoboticsPage whyRoboticsPage = new WhyRoboticsPage();
    private final CourseMapPage courseMapPage = new CourseMapPage();
    private final ProgramDevelopersPage programDevelopersPage = new ProgramDevelopersPage();
    private final NavigationPage navigationPage = new NavigationPage();

    @Test
    void checkThatHeaderItemsArePresentAndClickable() throws InterruptedException {
        topArea.shouldBeVisible();
        topArea.contactsShouldBeFollowing(
                "79013, Львів, вул. Степана Бандери, 28-а (V н.к.), к. 708",
                " +38 (032) 258-76-14 / +38 (032) 258-24-80",
                "ivt.dept@lpnu.ua"
        );
        topArea.facebookIconShouldBeVisible();
        topArea.clickOnFacebookIcon();
        Thread.sleep(15000);
    }

    @Test
    void checkHeaderButtons() throws InterruptedException {
        headerPage.shouldBeVisible();
        headerPage.clickOnButton("Robotics@NULP");
        aboutPage.titleShouldBeVisible();
        aboutPage.titleShouldBeFollowing("  Про програму");
        aboutPage.clickOnPlayButtonInYoutubeTab();

        headerPage.hoverOnButton("Robotics@NULP");
        headerPage.clickOnButton("Чому Робототехніка?");
        whyRoboticsPage.titleShouldBeVisible();
        whyRoboticsPage.titleShouldBeFollowing("  Чому Робототехніка?");

        headerPage.hoverOnButton("Robotics@NULP");
        headerPage.clickOnButton("Карта курсів");

        courseMapPage.titleShouldBeVisible();
        courseMapPage.titleShouldBeFollowing("  Карта курсів");
        courseMapPage.yearShouldBeFollowing("1 рік", "2 рік", "3 рік", "4 рік");
        Thread.sleep(1000);
        courseMapPage.selectYear("2 рік");
        Thread.sleep(1000);
        courseMapPage.selectYear("4 рік");

        headerPage.hoverOnButton("Robotics@NULP");
        headerPage.clickOnButton("Розробники програми");

        programDevelopersPage.titleShouldBeVisible();
        programDevelopersPage.titleShouldBeFollowing("  Розробники програми");
        navigationPage.scroll(100);
    }
}
