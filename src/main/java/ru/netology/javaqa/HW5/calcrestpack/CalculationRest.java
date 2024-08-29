package ru.netology.javaqa.HW5.calcrestpack;

public class CalculationRest {

    public int calcRest(int income, int expense, int vacationMoney) {

        int monthsRest = 0;
        int stash = 0;
        for (int i = 0; i < 12; i++) {
            if (stash < vacationMoney) {
                stash += income - expense;
            } else {
                stash = (stash - expense) / 3;
                monthsRest++;
            }
        }


        return monthsRest;
    }
}


