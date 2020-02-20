package com.comet;

public class Converter {
    public static int toConvert(String romanNumber) {

        int number = 0;
        String romanNumeral = romanNumber.toUpperCase();

        switch (romanNumeral) {
            case "X":
                number = 10;
                break;
            case "IX":
                number = 9;
                break;
            case "VIII":
                number = 8;
                break;
            case "VII":
                number = 7;
                break;

            case "VI":
                number = 6;
                break;

            case "V":
                number = 5;
                break;

            case "IV":
                number = 4;
                break;

            case "III":
                number = 3;
                break;

            case "II":
                number = 2;
                break;

            case "I":
                number = 1;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + romanNumeral);
        }
        return number;
    }



}
