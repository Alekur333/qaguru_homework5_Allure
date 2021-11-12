package kur.alexei.tests;

import kur.alexei.pages.BasePage;
import kur.alexei.pages.RepositoryPage;
import kur.alexei.testData.TestData;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class RepositoryTest extends BasePage {

    RepositoryPage repositoryPage = new RepositoryPage();

    @Test
    void checkNameIssuesOnRepositoryTest() {

        // открыть странице репозитория
        open(TestData.repositoryUrl);

        // найти элемент для issue
        repositoryPage.findElementIssuesOnRepoPage();

        // проверить назване найденного элемента
        repositoryPage.elementIssuesShouldBeNamedIssues();

    }


}
