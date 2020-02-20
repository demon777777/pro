package com.comet;

public abstract class ICalculator {

    abstract int add(String a, String b);

    abstract int subtract(String a, String b);

    abstract int multiply(String a, String b);

    abstract int divide(String a, String b);

    boolean enterValidation(String a,String b) {
        if ((b.matches("\\d+") && Integer.parseInt(b) != 0 && Integer.parseInt(b) < 11) || !b.equals("")
        && (a.matches("\\d+") && Integer.parseInt(a) != 0 && Integer.parseInt(b) < 11) || !a.equals("")) {
            return true;
        }else {

            enterValidation(a,b);
        }
        return false;
    }
}
