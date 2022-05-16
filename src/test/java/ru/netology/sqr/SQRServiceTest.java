package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    class sqrservicetest {
        @ParameterizedTest
        @CsvSource(value = {
                "positive values, 6, 100, 250",
                "positive values, 8, 100, 300",
                "positive values, 5, 100, 200"

        })
        public void shouldRangeNumbersInTheRange(String testName, int expected, int lowerRange, int upperRange) {
            ru.netology.srq.SQRService service = new ru.netology.srq.SQRService(); // Создаем сервис


            int actual = service.rangeNumbers(lowerRange, upperRange);
            assertEquals(expected, actual);


        }
    }
}
