package contacts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Enter {
  public static Date lastCreated;
    private String nameOfThePerson;
    Scanner scanner;
    private String surNameOfThePerson;
    private String numberTelephon;
    private static boolean matches;
    private int count;
    private String enterSelect;

    public Enter() throws InterruptedException {
        lastCreated = new Date();
        System.out.print("Enter action (add, remove, edit, count, list, exit): ");
        scanner = new Scanner(System.in);
        createPost();
       System.out.print(lastCreated);
    }

    private void last_Name() throws InterruptedException {
        System.out.print("Enter the surname of the person: ");
        surNameOfThePerson = scanner.nextLine();
        if (surNameOfThePerson != null) {
            Thread.sleep(300);
            System.out.println("-------------------> Ok! ");
            setSurNameOfThePerson(surNameOfThePerson);
        } else {
            System.out.print("Incorrect! Try again!: ");
            last_Name();
        }
    }

    private void first_Name() throws InterruptedException {
        System.out.print("Enter the name of the person: ");
        nameOfThePerson = scanner.nextLine();

        if (nameOfThePerson != null) {
            Thread.sleep(200);
            System.out.println("-------------------> Ok! ");
            setNameOfThePerson(nameOfThePerson);

        } else {
            System.out.print("Incorrect! Try again!: ");
            first_Name();
        }

    }

    private void enterNumber() throws InterruptedException {
        Thread.sleep(200);
        System.out.print("Enter the number: ");
        if (scanner.hasNextLine()) {
            numberTelephon = scanner.nextLine();
            String y = getNumberTelephon();
            String reg = ".?[0-9]{1}.[0-9]{3}.[0-9]{3}.[0-9]{2}.[A-Za-z0-9]{2,}";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(y);
            matches = matcher.matches();
            if (matches == true) {
                setNumberTelephon(numberTelephon);
                Thread.sleep(300);
                System.out.println("-------------------> Ok! ");
            } else {
                System.out.println("Incorrect enter!");
                scanner.reset();
                enterNumber();
            }
        }

    }

    private void add() throws InterruptedException {
        try {
            if (nameOfThePerson == null) {
                first_Name();
            }
            if (surNameOfThePerson == null) {
                last_Name();
            }
            if (numberTelephon == null) {
                enterNumber();
            }
            if (numberTelephon != null && nameOfThePerson != null && surNameOfThePerson != null) {
                count++;
                System.out.println(count + "." + " The record added.");
                System.out.print("Enter action (add, remove, edit, count, list, exit): ");

            } else {
                enterNumber();
                first_Name();
                last_Name();
            }
            createPost();
        } catch (Exception e) {
        }
    }

    private void remove() {
        try {
            if (nameOfThePerson != null) {
                nameOfThePerson = "";
            }
            if (surNameOfThePerson != null) {
                surNameOfThePerson = "";
            }
            if (numberTelephon != null) {
                numberTelephon = "";
            }
            count -= count;
            System.out.print("Enter action (add, remove, edit, count, list, exit): ");
            createPost();
        } catch (Exception e) {
        }
    }

    private void edit() throws InterruptedException {
 String editSelect = scanner.nextLine();
  try {
            if (editSelect.equals("1")) {
                System.out.print(getCount() + ". ");
                System.out.print(getSurNameOfThePerson() + " ");
                System.out.print(getNameOfThePerson() + " ");
                System.out.println(getNumberTelephon());

                System.out.print("Select a record: > " + getCount());
                String number = scanner.nextLine();
                System.out.print("Select a field  name, surname, number : > " + number);

            }     else{
                System.out.println("Н е т у !");
            }
      String number2 = scanner.nextLine();
      System.out.println("Enter number: >  " + number2);
            if("number".equals(number2)) {
                System.out.println(getNumberTelephon());
            }else {
                System.out.println("Wrong number format!");
                System.out.println("The record updated!");
            }
            System.out.print("Enter action (add, remove, edit, count, list, exit): > ");
            createPost();
        } catch (Exception e) {
        }
    }
private void list() throws InterruptedException{

    System.out.print(getCount() + ". ");
    System.out.print(getSurNameOfThePerson() + " ");
    System.out.print(getNameOfThePerson() + ", ");
    System.out.println("[no number]");
    System.out.print("Enter action (add, remove, edit, count, list, exit): > " );
    createPost();
    }
    private void createPost() throws InterruptedException {
        enterSelect = scanner.nextLine();
        if ("add".equals(enterSelect)) {
            add();
        }
       else if ("remove".equals(enterSelect)) {
            remove();
        }
        if ("exit".equals(enterSelect)) {
            exit();
        }
        else if ("list".equals(enterSelect)) {
            list();
        }
       else if ("edit".equals(enterSelect)) {
            edit();
        } else {
            System.out.println("Incorrect! Try again!");
        createPost();
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
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
private void exit(){

        System.exit(0);
}

    public Scanner getScanner() {
        scanner.close();
        return scanner;
    }
  
 
    
      
  
}

