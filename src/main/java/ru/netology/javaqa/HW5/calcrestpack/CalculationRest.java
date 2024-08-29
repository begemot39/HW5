package ru.netology.javaqa.HW5.calcrestpack;

public class CalculationRest {

    public int calcRest(int income, int expense) {

        int monthsRest = 0;
        int threshold = 0;


        if( income == 10_000 ) {
            for (int i = 0; i < 12; i++) {
                if (threshold < 20_000) {
                    threshold += income - expense;
                } else {
                    threshold = (threshold - expense) / 3;
                    monthsRest++;
                }
            }
        } else if( income == 100_000 ){
            for (int i = 0; i < 12; i++) {
                if (threshold < 150_000) {
                    threshold += income - expense;
                } else {
                    threshold = (threshold - expense) / 3;
                    monthsRest++;
                }
            }
        }
        return monthsRest;
    }
}


