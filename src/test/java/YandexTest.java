import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class YandexTest {
    @Test
    void selenideSearchInYandex() {
        // Открыть google
        open("https://ya.ru");

        // Ввести Selenide в поиск
        $(byName("text")).setValue("qa guru").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("qa.guru"));
    }
}


