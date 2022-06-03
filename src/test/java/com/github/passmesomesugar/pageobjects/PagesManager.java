package com.github.passmesomesugar.pageobjects;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class PagesManager {
    private IndexPage indexPage;
    private ProfilePage profilePage;

    public IndexPage getIndexPage() {
        return indexPage;
    }


    public ProfilePage getProfilePage() {
        return profilePage;
    }

    @BeforeClass(alwaysRun = true)
    public void setUpPages() {
        indexPage = new IndexPage();

    }

    @AfterClass(alwaysRun = true)
    public void afterClassActions() {
        WebDriverRunner.closeWebDriver(); // or clear cookies?
    }


}
