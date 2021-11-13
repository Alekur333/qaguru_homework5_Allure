package kur.alexei.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import kur.alexei.pages.BasePage;
import kur.alexei.pages.RepositoryPage;
import kur.alexei.testData.TestData;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class SelenideLoggerRepositoryTest extends BasePage {

    RepositoryPage repositoryPage = new RepositoryPage();

    @Test
    void checkNameIssuesOnRepositoryLoggerTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        // открыть страницу репозитория
        open(TestData.repositoryUrl);

        // найти на странице элемент для issues
        repositoryPage.findElementIssuesOnRepoPage();

        // проверить назване найденного элемента
        repositoryPage.elementIssuesShouldBeNamedIssues();
        takeScreenshot();

    }


}
