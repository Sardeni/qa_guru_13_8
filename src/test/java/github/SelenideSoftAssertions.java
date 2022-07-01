package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertions {

    @Test
    void openSoftAssertionsPage() {

        open("https://github.com/selenide/selenide");
        $("[id=wiki-tab]").click();
        $("[id=wiki-body]").$$("a").filterBy(text("Soft assertions")).first().click();
        $("[id=user-content-3-using-junit5-extend-test-class]").shouldBe(visible);
    }
}
