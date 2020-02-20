package com.comet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        while (true) {
           // Scanner sc = new Scanner(System.in);
            ArabicCalc arabicCalc = new ArabicCalc();
            RomeCalc calculator = new RomeCalc();

            String a;
            String b;
            String operation;

            int calcType;

            do {
                System.out.print("Числа от 1 до 11 (\"*,/,+,-\") : ");

                a = sc.next();

                operation = sc.next();

                b = sc.next();


                calcType = validation(a, b, operation);


            } while (calcType < 0);

            if (calcType == 2)
                operating(operation, calculator.add(a, b), calculator.subtract(a, b), calculator.divide(a, b), calculator.multiply(a, b));
            else
                operating(operation, arabicCalc.add(a, b), arabicCalc.subtract(a, b), arabicCalc.divide(a, b), arabicCalc.multiply(a, b));
        }
    }

    private static void operating(String operation, int add, int subtract, int divide, int multiply) {
        switch (operation) {
            case "+":
                System.out.println(add);
                break;
            case "-":
                System.out.println(subtract);
                break;
            case "/":
                System.out.println(divide);
                break;
            case "*":
                System.out.println(multiply);
                break;
        }
    }

    private static int validation(String a, String b, String operation) throws Exception {

            String regex = "\\d+";
        List<String> operationValidation = new ArrayList<>();
        operationValidation.add("+");
        operationValidation.add("-");
        operationValidation.add("/");
        operationValidation.add("*");

        if (!operationValidation.contains(operation)) {
            System.out.println("Такой операции нет");
            return -1;
        }

        if (a.matches(regex) && b.matches(regex))
            return 1;
        else if (!a.matches(regex) && !b.matches(regex))
            return 2;
        else {
            System.out.println("Операнды должны быть одного типа!");
                if (!a.matches(regex) || !b.matches(regex) || !b.equals("0")) {
                    sc.next();
                }

        }
        return 0;

    }


}
