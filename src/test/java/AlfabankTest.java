import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class AlfabankTest {

    @Test
    void testAlfa() {
        open("https://alfabank.ru/");
        $(byText("Вклады")).click();
        $$(byText("Архивные счета и депозиты")).find(visible).click();
        $$x("//*[@data-widget-name=\"CatalogCard\"]").shouldBe(CollectionCondition.size(9));
    }
}