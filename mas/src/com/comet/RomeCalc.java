package com.comet;

import static com.comet.Converter.toConvert;


public class RomeCalc extends ICalculator {

    @Override
    int add(String a, String b) {
        return toConvert(a) + toConvert(b);
    }

    @Override
    int subtract(String a, String b) {
        return toConvert(a) - toConvert(b);
    }

    @Override
    int multiply(String a, String b) {
        return toConvert(a) * toConvert(b);
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