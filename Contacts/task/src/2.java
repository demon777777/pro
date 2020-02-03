package contacts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Enter {

    private String nameOfThePerson;
    Scanner scanner;
    private String surNameOfThePerson;
    private String numberTelephon;
 private static boolean matches;

    public Enter(){
       scanner = new Scanner(System.in);
        createPost();
    }
    private void first_Name_Last_Name()throws InterruptedException {
        System.out.println("Enter the name of the person:");
        nameOfThePerson = scanner.nextLine();

        if(nameOfThePerson != null) {
            Thread.sleep(200);
            System.out.println("-------------------> Ok! ");
            setNameOfThePerson(nameOfThePerson);
            Thread.sleep(300);
        }
        System.out.println("Enter the surname of the person:");
        surNameOfThePerson = scanner.nextLine();
        if(surNameOfThePerson != null) {
            Thread.sleep(300);
            System.out.println("-------------------> Ok! ");
            setSurNameOfThePerson(surNameOfThePerson);
        }
    }
private void enterNumber()throws InterruptedException {
    Thread.sleep(300);
    System.out.println("Enter the number:");
    if (scanner.hasNextLine()) {
        numberTelephon = scanner.nextLine();
       String y = getNumberTelephon();
        String reg = ".?[0-9]{1}.[0-9]{3}.[0-9]{3}.[0-9]{2}.[A-Za-z0-9]{2,}";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(y);
        matches = matcher.matches();
        if(matches == true) {
            setNumberTelephon(numberTelephon);
            Thread.sleep(300);
            System.out.println("-------------------> Ok! ");
        }else {
            System.out.println("Incorrect enter!");
            scanner.reset();
        enterNumber();
        } }

    }

private void createPost(){
    System.out.println("Create a post!");
    try {
        Thread.sleep(300);
    }catch (Exception e){}
    try {
        if (getNumberTelephon() == null) {
            enterNumber();
            Thread.sleep(600);
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
          enterNumber();
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
