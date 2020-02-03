package contacts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Enter {
    private String nameOfThePerson;

    private String surNameOfThePerson;
    private String numberTelephon;


    private Scanner scanner;
    static boolean matches = true;

    private void first_Name_Last_Name() {
        System.out.println("Enter the name of the person:");
        nameOfThePerson = scanner.nextLine();
        setNameOfThePerson(nameOfThePerson);

        System.out.println("Enter the surname of the person:");
        surNameOfThePerson = scanner.nextLine();
        setSurNameOfThePerson(surNameOfThePerson);
        System.out.println("Enter the number:");
    }

    public void hasNumber() {
        System.out.println("Create a post!");
        if (scanner.hasNextLine()) {
            numberTelephon = scanner.nextLine();
            String y = getNumberTelephon();
            String reg = ".?[0-9]{1}.[0-9]{2,}.[0-9]{2,}.[0-9]{2,}.[A-Za-z0-9]{2,}";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(y);
            matches = matcher.matches();
            System.out.println();
            if (matches == true) {
                setNumberTelephon(numberTelephon);
                System.out.println("Phone : " + y);
            } else {
                System.out.println("Incorrect input!");
                scanner.reset();
                hasNumber();
            }

        }
        System.out.println();

    }


    public Enter() {
        scanner = new Scanner(System.in);
        try {
            if (numberTelephon == null) {
                hasNumber();
            }
            if (nameOfThePerson == null || surNameOfThePerson == null) {
                first_Name_Last_Name();
            }
            Thread.sleep(600);
            if (numberTelephon != null && nameOfThePerson != null && surNameOfThePerson != null) {
                System.out.println("A record created!");
                System.out.println();
                Thread.sleep(300);
                System.out.println("A Phone Book with a single record created!");
            } else {
                hasNumber();
                first_Name_Last_Name();
            }
        } catch (Exception e) {
        }
    }

    public String getNameOfThePerson() {
        return nameOfThePerson;
    }

    public void setNameOfThePerson(String nameOfThePerson) {
        this.nameOfThePerson = nameOfThePerson;
    }

    public String getSurNameOfThePerson() {
        return surNameOfThePerson;
    }

    public void setSurNameOfThePerson(String surNameOfThePerson) {
        this.surNameOfThePerson = surNameOfThePerson;
    }

    public void setNumberTelephon(String numberTelephon) {
        this.numberTelephon = numberTelephon;
    }

    public String getNumberTelephon() {
        return numberTelephon;
    }
}
