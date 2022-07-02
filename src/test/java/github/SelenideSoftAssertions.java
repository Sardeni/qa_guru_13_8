package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertions {

    @Test
    void openSoftAssertionsPage() {

        open("https://github.com/selenide/selenide");
        $("[id=wiki-tab]").click();
        $(byTagAndText("button", "Show 2 more pages…")).click();
        $(byTagAndText("a", "Soft assertions")).click();
        $("[id=user-content-3-using-junit5-extend-test-class]").shouldBe(visible);

        sleep(5000);
    }
}
