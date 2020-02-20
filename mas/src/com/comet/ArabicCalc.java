package com.comet;

public class ArabicCalc extends ICalculator {

    @Override
    int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    @Override
    int subtract(String a, String b) {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    @Override
    int multiply(String a, String b) {
        return Integer.parseInt(a) * Integer.parseInt(b);
    }

    @Override
    int divide(String a, String b) {

        if (enterValidation(a, b)) {
            int Ib = Integer.parseInt(b);
            if (Ib != 0)
            return Integer.parseInt(a) / Ib;
         }
        return 0;
    }
}