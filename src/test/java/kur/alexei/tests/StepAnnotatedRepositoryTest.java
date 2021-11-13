package kur.alexei.tests;

import kur.alexei.pages.BasePage;
import kur.alexei.steps.Steps;
import kur.alexei.testData.TestData;
import org.junit.jupiter.api.Test;

public class StepAnnotatedRepositoryTest extends BasePage {
    Steps steps = new Steps();
    TestData testData = new TestData();
    private final String repositoryUrl = testData.repositoryUrl;

    @Test
    void checkNameIssuesOnRepositoryStepsTest() {
        steps.goToRepository(repositoryUrl);
        steps.findElementIssuesOnRepoPage();
        steps.elementIssuesShouldBeNamedIssues();
        takeScreenshot();
    }
}
