package ru.netology.javaqa.HW5.calcrestpack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;


public class CalculationRestTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calcRestParam.csv")
    public void calcRestTest(int expected, int income, int expenses, int vacationMoney) {
        CalculationRest restCalc = new CalculationRest();

        int actual = restCalc.calcRest(income, expenses, vacationMoney);

        Assertions.assertEquals(expected, actual);
    }
}
